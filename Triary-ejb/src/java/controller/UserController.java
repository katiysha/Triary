/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import control.serviceimplem.UserService;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import model.Users;

/**
 *
 * @author kate
 */
<<<<<<< HEAD
@ManagedBean(name="loginController")
=======
@ManagedBean(name="userController")
>>>>>>> 13fc261df3b4eff10e3f2df1d8817ca0a9b1ec13
@RequestScoped
@Controller
public class UserController {
    
    private Integer user_id;
    private String user_name;
    private List<Users> usr_list;
    private UserService userService;
    private FacesMessage messages;
    
    /**
     *
     * @param userService
     */
<<<<<<< HEAD
//    @Inject
=======
    @Inject
>>>>>>> 13fc261df3b4eff10e3f2df1d8817ca0a9b1ec13
    public UserController (UserService userService){
        this.userService = userService;
    }
    
<<<<<<< HEAD
//    @Inject
=======
    @Inject
>>>>>>> 13fc261df3b4eff10e3f2df1d8817ca0a9b1ec13
    public void setFacesMessage(FacesMessage messages){
        this.messages = messages;
    }
    
    public String listById() {
        
        usr_list = userService.getByUser(user_id);
        
        if(usr_list.isEmpty()) {
            return "succed";
        } else {
           
            return "failed";
        }
    }
    
    public String listByUName() {
        
        usr_list = userService.findByName(user_name);
        
        Integer size = usr_list.size();
        
        if(size != 0) {
            return "succed";
        } else {
           
            return "failed";
        }
    }
    
    public String getUser_name() {return user_name;}
    public void setUser_name(String user_name) {this.user_name = user_name;}
 
    public Integer getUser_Id() {return user_id;}
    public void setUser_Id(Integer user_id) {this.user_id = user_id;}
    
    
}
