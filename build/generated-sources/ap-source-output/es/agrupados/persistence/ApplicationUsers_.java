package es.agrupados.persistence;

import es.agrupados.persistence.ApplicationRoles;
import es.agrupados.persistence.ApplicationUserDetails;
import es.agrupados.persistence.Coupons;
import es.agrupados.persistence.Offers;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-05T00:43:34")
@StaticMetamodel(ApplicationUsers.class)
public class ApplicationUsers_ { 

    public static volatile SingularAttribute<ApplicationUsers, String> password;
    public static volatile CollectionAttribute<ApplicationUsers, Coupons> couponsCollection;
    public static volatile SingularAttribute<ApplicationUsers, ApplicationRoles> role;
    public static volatile SingularAttribute<ApplicationUsers, Boolean> active;
    public static volatile SingularAttribute<ApplicationUsers, Integer> id;
    public static volatile SingularAttribute<ApplicationUsers, String> email;
    public static volatile CollectionAttribute<ApplicationUsers, ApplicationUserDetails> applicationUserDetailsCollection;
    public static volatile SingularAttribute<ApplicationUsers, String> username;
    public static volatile CollectionAttribute<ApplicationUsers, Offers> offersCollection;

}