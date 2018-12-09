package es.agrupados.persistence;

import es.agrupados.persistence.ApplicationUsers;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-05T00:43:34")
@StaticMetamodel(ApplicationRoles.class)
public class ApplicationRoles_ { 

    public static volatile CollectionAttribute<ApplicationRoles, ApplicationUsers> applicationUsersCollection;
    public static volatile SingularAttribute<ApplicationRoles, String> rolename;
    public static volatile SingularAttribute<ApplicationRoles, Integer> id;

}