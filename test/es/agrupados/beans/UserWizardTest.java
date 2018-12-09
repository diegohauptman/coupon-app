/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.agrupados.beans;

import es.agrupados.persistence.ApplicationUserDetails;
import es.agrupados.persistence.ApplicationUsers;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.primefaces.event.FlowEvent;

/**
 *
 * @author mundakamacbook
 */
public class UserWizardTest {
    
    public UserWizardTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getUser method, of class UserWizard.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        UserWizard instance = new UserWizard();
        ApplicationUsers expResult = null;
        ApplicationUsers result = instance.getUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserDetails method, of class UserWizard.
     */
    @Test
    public void testGetUserDetails() {
        System.out.println("getUserDetails");
        UserWizard instance = new UserWizard();
        ApplicationUserDetails expResult = null;
        ApplicationUserDetails result = instance.getUserDetails();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUser method, of class UserWizard.
     */
    @Test
    public void testSetUser() {
        System.out.println("setUser");
        ApplicationUsers user = null;
        UserWizard instance = new UserWizard();
        instance.setUser(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class UserWizard.
     */
    @Test
    public void testSave(int role) {
        System.out.println("save");
        UserWizard instance = new UserWizard();
        instance.save(role);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isSkip method, of class UserWizard.
     */
    @Test
    public void testIsSkip() {
        System.out.println("isSkip");
        UserWizard instance = new UserWizard();
        boolean expResult = false;
        boolean result = instance.isSkip();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSkip method, of class UserWizard.
     */
    @Test
    public void testSetSkip() {
        System.out.println("setSkip");
        boolean skip = false;
        UserWizard instance = new UserWizard();
        instance.setSkip(skip);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onFlowProcess method, of class UserWizard.
     */
    @Test
    public void testOnFlowProcess() {
        System.out.println("onFlowProcess");
        FlowEvent event = null;
        UserWizard instance = new UserWizard();
        String expResult = "";
        String result = instance.onFlowProcess(event);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
