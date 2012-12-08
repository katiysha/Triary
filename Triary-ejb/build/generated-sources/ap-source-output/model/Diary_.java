package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Comment;
import model.Users;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2012-12-07T22:58:13")
@StaticMetamodel(Diary.class)
public class Diary_ { 

    public static volatile SingularAttribute<Diary, Integer> repeat_amount;
    public static volatile SingularAttribute<Diary, String> weight;
    public static volatile SingularAttribute<Diary, String> fillings;
    public static volatile SingularAttribute<Diary, String> training_type;
    public static volatile SingularAttribute<Diary, Users> owner;
    public static volatile SingularAttribute<Diary, String> muscle_gr;
    public static volatile SingularAttribute<Diary, String> tasks;
    public static volatile SingularAttribute<Diary, String> tr_duration;
    public static volatile ListAttribute<Diary, Comment> commentList;

}