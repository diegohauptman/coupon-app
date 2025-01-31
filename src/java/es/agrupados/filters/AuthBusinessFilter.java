/*
 * The MIT License
 *
 * Copyright 2015 SEAS - Estudios Abiertos.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package es.agrupados.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Clase que ejerce de filtro para permitir o no el acceso a la carpeta
 * "business". El usuario debe estar logueado y tener como rol "business".
 *
 * @author Diego
 */
public class AuthBusinessFilter implements Filter {

    private FilterConfig configuration;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.configuration = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res,
            FilterChain chain) throws IOException, ServletException {
       
        System.out.println("Inside Business Filter");
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;
        String uri = request.getRequestURI();
        HttpSession session = request.getSession(false);
        System.out.println("URI: " + uri);
        System.out.println("Session: " + session);
        System.out.println("Context: " + request.getContextPath());
        boolean isBusiness = session != null ? (session.getAttribute("business") != null) : false;
        System.out.println("Is Business: " + isBusiness);
        if (!isBusiness && uri.contains("/business/")) {
            response.sendRedirect(request.getContextPath() + "/index.xhtml");
        }else if (isBusiness && (uri.endsWith("/index.xhtml") || uri.equals("/Agrupados/"))){
            response.sendRedirect(request.getContextPath() + "/business/BusinessIndex.xhtml");
        } else {
            chain.doFilter(request, response);
        }
        //System.out.println("Session attribute: " + session.getAttribute("admin").toString());
    }

    @Override
    public void destroy() {
        configuration = null;
    }

}
