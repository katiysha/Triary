/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.mbeans;

import control.serviceimplem.PublicationService;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.Publication;
import model.Users;

/**
 *
 * @author kate
 */

@ManagedBean(name = "publMB")
@SessionScoped
public class PublicationsManagedBean {
    private Users currentUser;
    private String login;
    private String password;
    private int role;
    private List<Publication> lstNews;
    private List<Publication> lstTrMethods;
    private List<Publication> lstDiets;
    @EJB
    private PublicationService PublicationService;
    
    /**
     *
     */
    public PublicationsManagedBean() {
    }
    
    public List<Publication> getLstNews() {
        setLstPublication();
        return lstNews;
    }
    
    public void setLstPublication() {
       lstNews = (List<Publication>) PublicationService.getByType("NEWS");
    }
    
    public List<Publication> getLstTrainingMethods() {
        setLstTrainingMethods();
        return lstTrMethods;
    }
    
    public void setLstTrainingMethods() {
       lstTrMethods = (List<Publication>) PublicationService.getByType("TRAININGMETHOD");
    }
    
    public List<Publication> getLstDiets() {
        setLstDiets();
        return lstDiets;
    }
    
    public void setLstDiets() {
       lstDiets = (List<Publication>) PublicationService.getByType("DIET");
    }
}
