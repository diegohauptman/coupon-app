package es.agrupados.persistence;

import es.agrupados.persistence.ApplicationUsers;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-05T00:43:34")
@StaticMetamodel(ApplicationUserDetails.class)
public class ApplicationUserDetails_ { 

    public static volatile SingularAttribute<ApplicationUserDetails, String> country;
    public static volatile SingularAttribute<ApplicationUserDetails, String> dniCif;
    public static volatile SingularAttribute<ApplicationUserDetails, String> address;
    public static volatile SingularAttribute<ApplicationUserDetails, String> province;
    public static volatile SingularAttribute<ApplicationUserDetails, String> city;
    public static volatile SingularAttribute<ApplicationUserDetails, Double> latitude;
    public static volatile SingularAttribute<ApplicationUserDetails, String> name;
    public static volatile SingularAttribute<ApplicationUserDetails, LocalDate> dateOfRegistration;
    public static volatile SingularAttribute<ApplicationUserDetails, Integer> id;
    public static volatile SingularAttribute<ApplicationUserDetails, ApplicationUsers> applicationUsersId;
    public static volatile SingularAttribute<ApplicationUserDetails, Double> longitude;
    public static volatile SingularAttribute<ApplicationUserDetails, LocalDate> leavingDate;

}