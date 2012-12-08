package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Comment;
import model.Users;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2012-12-07T22:58:13")
@StaticMetamodel(Publication.class)
public class Publication_ { 

    public static volatile SingularAttribute<Publication, String> subtext;
    public static volatile SingularAttribute<Publication, String> text;
    public static volatile SingularAttribute<Publication, String> title;
    public static volatile SingularAttribute<Publication, Users> autor;
    public static volatile SingularAttribute<Publication, Date> date_publ;
    public static volatile SingularAttribute<Publication, String> type;
    public static volatile ListAttribute<Publication, Comment> commentList;

}