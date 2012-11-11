/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control.serviceimplem;

import control.IProfileService;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Comment;
import model.Profile;
import model.Users;
/**
 *
 * @author aliona
 */
public class ProfileService extends Generic<Profile> implements IProfileService{

    @PersistenceContext(unitName = "Triary-ejbPU")
    private EntityManager em;

    public ProfileService() {
        super(Profile.class);
    }
    
    public void persist(Object object) {
        em.persist(object);
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    
    @Override
    public Profile getByUser(Users usr) {
        return (Profile) em.createNamedQuery("Profile.getByUser").setParameter("owner", usr);
    }

    @Override
    public void manageSettings() {
        
    }

    @Override
    public void addParameters() {
        
    }

    @Override
    public void viewStatistics() {
        
    }

    @Override
    public void addAddons() {
        
    }
    
}