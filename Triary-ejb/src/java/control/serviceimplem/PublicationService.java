/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control.serviceimplem;

import control.IPublicationService;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Comment;
import model.Publication;
import model.Users;
/**
 *
 * @author aliona
 */

@LocalBean
@Stateless(name="PublicationService")
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
        return (List<Publication>) em.createNamedQuery("Publication.findByText").setParameter("text", substr).getResultList();
    }

    @Override
    public List<Publication> findByDate(String date) {
        return (List<Publication>) em.createNamedQuery("Publication.findByDate").setParameter("date", date).getResultList();
    }

    @Override
    public List<Publication> getByTitle(String title) {
        return (List<Publication>) em.createNamedQuery("Publication.findByTitle").setParameter("title", title).getResultList();
    }

    @Override
    public List<Publication> getByType(String type) {
        return (List<Publication>) em.createNamedQuery("Publication.findByType").setParameter("type", type).getResultList();
    }

    @Override
    public List<Publication> getByAutor(Users usr) {
        return (List<Publication>) em.createNamedQuery("Publication.findByAutor").setParameter("user", usr).getResultList();
    }

    @Override
    public List<Publication> getAll() {
        return (List<Publication>) em.createNamedQuery("Publication.findAll").getResultList();
    }
    
}
