package model.baseclass;

import java.security.Timestamp;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2012-12-18T20:02:05")
@StaticMetamodel(UserBase.class)
public class UserBase_ extends BaseEntity_ {

    public static volatile SingularAttribute<UserBase, String> phone;
    public static volatile SingularAttribute<UserBase, Timestamp> register_date;
    public static volatile SingularAttribute<UserBase, String> email;
    public static volatile SingularAttribute<UserBase, String> name;
    public static volatile SingularAttribute<UserBase, String> surname;
    public static volatile SingularAttribute<UserBase, String> login;
    public static volatile SingularAttribute<UserBase, String> password;

}