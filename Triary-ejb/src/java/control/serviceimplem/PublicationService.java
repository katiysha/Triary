/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control.serviceimplem;

import control.IPublicationService;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Comment;
import model.Publication;
import model.Users;
/**
 *
 * @author aliona
 */
public class PublicationService extends Generic<Publication> implements IPublicationService {


    @PersistenceContext(unitName = "Triary-ejbPU")
    private EntityManager em;

    public PublicationService() {
        super(Publication.class);
    }
    
    public void persist(Object object) {
        em.persist(object);
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    @Override
    public List<Publication> findByText(String substr) {
        return (List<Publication>) em.createNamedQuery("Comment.findByText").setParameter("text", substr).getResultList();
    }

    @Override
    public List<Publication> findByDate(String date) {
        return (List<Publication>) em.createNamedQuery("Comment.findByDate").setParameter("date", date).getResultList();
    }

    @Override
    public List<Publication> getByTitle(String title) {
        return (List<Publication>) em.createNamedQuery("Comment.findByTitle").setParameter("title", title).getResultList();
    }

    @Override
    public List<Publication> getByType(String type) {
        return (List<Publication>) em.createNamedQuery("Comment.findByType").setParameter("type", type).getResultList();
    }

    @Override
    public List<Publication> getByAutor(Users usr) {
        return (List<Publication>) em.createNamedQuery("Comment.findByAutor").setParameter("user", usr).getResultList();
    }
    
}
