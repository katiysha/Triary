package model;

import java.util.HashMap;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Users;
import model.baseclass.BaseEntity_;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2012-12-18T20:02:05")
@StaticMetamodel(Statistics.class)
public class Statistics_ extends BaseEntity_ {

    public static volatile SingularAttribute<Statistics, String> title;
    public static volatile SingularAttribute<Statistics, Users> owner;
    public static volatile SingularAttribute<Statistics, Integer> type;
    public static volatile SingularAttribute<Statistics, HashMap> hm;

}