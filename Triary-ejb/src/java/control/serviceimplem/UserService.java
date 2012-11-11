/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control.serviceimplem;


import control.IUserService;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Publication;
import model.Users;

/**
 *
 * @author kate
 */
public class UserService extends Generic<Users> implements IUserService{

    @PersistenceContext(unitName = "Triary-ejbPU")
    private EntityManager em;

    public UserService() {
        super(Users.class);
    }
    
    public void persist(Object object) {
        em.persist(object);
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
    @Override
    public List<Users> getByUser(Integer usr_id) {
       return (List<Users>) em.createNamedQuery("Users.getByUser").setParameter("usr", usr_id).getResultList();
    }

    @Override
    public List<Users> findByName(String name) {
        return (List<Users>) em.createNamedQuery("Users.getByName").setParameter("name", name).getResultList();
    }

    @Override
    public boolean enableProfile() {
        return true;
    }

    @Override
    public void addRation(String ration) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void addDiet(String diet) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean enableStatistics() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
