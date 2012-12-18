/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.mbeans;

import control.serviceimplem.ProfileService;
import control.serviceimplem.UserService;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import model.Profile;
import model.Users;

/**
 *
 * @author kate
 */
@ManagedBean(name = "profileMB")
@SessionScoped
public class ProfileManagedBean {
    
    private ProfileService profileService;
    private Profile curprofile;
    private Users curuser;
    private UserService userService;
    
    
    public ProfileManagedBean(){
    
    }

    /**
     * @return the profileService
     */
    public ProfileService getProfileService() {
        return profileService;
    }

    /**
     * @param profileService the profileService to set
     */
    public void setProfileService(ProfileService profileService) {
        this.profileService = profileService;
    }

    /**
     * @return the curprofile
     */
    public Profile getCurprofile() {
        return curprofile;
    }

    /**
     * @param curprofile the curprofile to set
     */
    public void setCurprofile(Profile curprofile) {
        this.curprofile = curprofile;
    }
    
    public Profile getProfile(){
    
    }
    
    @PostConstruct
    public void init() {
        String id_user = ((HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest()).getParameter("id_user");
//        Integer id = new Integer(id_prof);
        try {
            curuser = (Users) userService.find(new Integer(id_user));
            curprofile = profileService.getByUser(curuser);
            
            System.out.println(((HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest()).getQueryString());
//            System.out.print(updatePubl.getText());

        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    /**
     * @return the curuser
     */
    public Users getCuruser() {
        return curuser;
    }

    /**
     * @param curuser the curuser to set
     */
    public void setCuruser(Users curuser) {
        this.curuser = curuser;
    }

    /**
     * @return the userService
     */
    public UserService getUserService() {
        return userService;
    }

    /**
     * @param userService the userService to set
     */
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    
}
