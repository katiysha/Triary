/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control.serviceimplem;

import control.ICommentService;
import java.security.Timestamp;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.validation.ConstraintViolationException;
import model.Comment;
import model.Diary;
import model.Publication;
import model.Users;

/**
 *
 * @author kate
 */
@Stateless
@LocalBean

public class CommentService extends Generic<Comment> implements ICommentService{

    @PersistenceContext(unitName = "Triary-ejbPU")
    private EntityManager em;

    public CommentService() {
        super(Comment.class);
    }
    
    public void persist(Object object) {
        em.persist(object);
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
    @Override
    public List<Comment> getByPublication(Publication publ) {
        return (List<Comment>) em.createNamedQuery("Comment.findByPubl").setParameter("publication", publ).getResultList();
    }

    @Override
    public List<Comment> getByDiary(Diary diary) {
        return (List<Comment>) em.createNamedQuery("Comment.findByDiary").setParameter("diary", diary).getResultList();
    }
    
    @Override
    public List<Comment> getAll() {
        
        return (List<Comment>) em.createNamedQuery("Comment.findAll").getResultList();
    }

    @Override
    public boolean addComment(Comment com, Publication pub, Users usr) {
        try{
        com.setAutor(usr);
        com.setPublication(pub);
        create(com);
        pub.addComment(com);
        usr.addComment(com);
        } catch (ConstraintViolationException e) {
            System.out.print(e.getConstraintViolations());
            return false;
        }    
        return true;
    }

    @Override
    public boolean removeComment(Comment com, Publication pub, Users usr) {
        try{
            pub.delComment(com);
            usr.delComment(com);
            remove(com);
        } catch (NullPointerException e){
            return false;
        }
        return true;
    }

    @Override
    public boolean addComment(Comment com, Diary diary, Users usr) {
        try{
            com.setAutor(usr);
            com.setDiary(diary);
            create(com);
            diary.addComment(com);
            usr.addComment(com);
        } catch (ConstraintViolationException e) {
            System.out.print(e.getConstraintViolations());
            return false;
        }    
        return true;
    }

    @Override
    public boolean removeComment(Comment com, Diary diary, Users usr) {
         try{
            diary.delComment(com);
            usr.delComment(com);
            remove(com);
        } catch (NullPointerException e){
            return false;
        }
        return true;
    }

   

   
    
}