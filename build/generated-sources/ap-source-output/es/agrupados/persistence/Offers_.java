package es.agrupados.persistence;

import es.agrupados.persistence.ApplicationUsers;
import es.agrupados.persistence.Coupons;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-05T00:43:34")
@StaticMetamodel(Offers.class)
public class Offers_ { 

    public static volatile SingularAttribute<Offers, Float> startPrice;
    public static volatile SingularAttribute<Offers, String> image;
    public static volatile SingularAttribute<Offers, Float> offerPrice;
    public static volatile CollectionAttribute<Offers, Coupons> couponsCollection;
    public static volatile SingularAttribute<Offers, Date> endDate;
    public static volatile SingularAttribute<Offers, String> description;
    public static volatile SingularAttribute<Offers, Boolean> active;
    public static volatile SingularAttribute<Offers, Integer> id;
    public static volatile SingularAttribute<Offers, String> title;
    public static volatile SingularAttribute<Offers, ApplicationUsers> applicationUsersId;
    public static volatile SingularAttribute<Offers, Date> startDate;

}