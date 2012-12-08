/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import control.serviceimplem.ProfileService;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import model.Profile;
import model.Users;


/**
 *
 * @author aliona
 */
@ManagedBean(name="profileController")
@RequestScoped
@Controller
public class ProfileController {
        private Integer profile_owner;
    private ProfileService profileService;
    private FacesMessage messages;
    private List<Profile> profile_list;
    
    
     @Inject
    public ProfileController (ProfileService profileService){
        this.profileService=profileService;
    }
    
    @Inject
    public void setFacesMessage(FacesMessage messages){
        this.messages = messages;
    }
    
      public String listByUsr( Users usr) {
          profile_list = (List<Profile>) profileService.getByUser(usr);
           if(profile_list.isEmpty()) {
            return "succed";
        } else {
           
            return "failed";
        }
    }
        
           
    public Integer getProfile_owner() {return profile_owner;}
    public void setProfile_owner(Integer profile_owner) {this.profile_owner = profile_owner;}
    
    
}
