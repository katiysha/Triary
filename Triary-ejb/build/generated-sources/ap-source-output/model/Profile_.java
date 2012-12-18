package model;

import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Users;
import model.baseclass.BaseEntity_;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2012-12-18T20:02:05")
@StaticMetamodel(Profile.class)
public class Profile_ extends BaseEntity_ {

    public static volatile SingularAttribute<Profile, String> ration;
    public static volatile SingularAttribute<Profile, Boolean> diary_enabled;
    public static volatile SingularAttribute<Profile, String> weight;
    public static volatile SingularAttribute<Profile, String> diet;
    public static volatile SingularAttribute<Profile, Users> owner;
    public static volatile SingularAttribute<Profile, Timestamp> date;
    public static volatile SingularAttribute<Profile, Boolean> stat_enabled;
    public static volatile SingularAttribute<Profile, Integer> muscle_dimension;

}