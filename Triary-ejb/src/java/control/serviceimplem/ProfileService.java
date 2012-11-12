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
    public void manageSettings(String new_name, String new_surname, String new_login, String new_password ) {
        Users usr = new Users();
        usr.setName(new_name);
        usr.setSurName(new_surname);
        usr.setLogin(new_login);
        usr.setPassword(new_password);
        
        
    }
       
      
    @Override
    public void addOwnMethod(String metod, Profile profile) {
        profile.setRation(metod);
        
    }

    @Override
    public void addDiet(String diet, Profile profile) {
        profile.setDiet(diet);
    }
    @Override
    public void enabledDiary(Boolean enDiary){
         Boolean diary_en = null;
        diary_en = (Boolean) em.createNamedQuery("Profile.getByDiaryEnabled").getSingleResult();
        if (diary_en = true ) {diary_en = false;}
        if (diary_en = false ) {diary_en = true;}
        em.createNamedQuery("Profile.updateDiaryEnabled");
    }
    
    @Override
    public void enabledStatistic(Boolean enStatistic){
        Boolean statistic_en = null;
        statistic_en = (Boolean) em.createNamedQuery("Profile.getByStatisticsEn").getSingleResult();
        if (statistic_en = true ) {statistic_en = false;}
        if (statistic_en = false ) {statistic_en = true;}
        em.createNamedQuery("Profile.updateStatisticsEn");
    }
}