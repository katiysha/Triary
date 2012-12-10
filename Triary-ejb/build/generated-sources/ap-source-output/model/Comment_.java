package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Diary;
import model.Publication;
import model.Users;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2012-12-10T23:42:11")
@StaticMetamodel(Comment.class)
public class Comment_ { 

    public static volatile SingularAttribute<Comment, String> text;
    public static volatile SingularAttribute<Comment, Diary> diary;
    public static volatile SingularAttribute<Comment, Users> autor;
    public static volatile SingularAttribute<Comment, Date> date;
    public static volatile SingularAttribute<Comment, Publication> publication;

}