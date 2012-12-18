/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import control.serviceimplem.UserService;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;


/**
 *
 * @author kate
 */
@ManagedBean(name="loginController")
@RequestScoped
@Controller
public class LoginController {
    private String username;
    private String password;
    private UserService userService;
    //private FacesMessage messages;
    
    @Inject
    public LoginController (UserService userService){
        this.userService = userService;
    }
    
    //@Inject
    //public void setFacesMessage(FacesMessage messages){
    //    this.messages = messages;
    //}
    
    public String loginClicked() {
        boolean isValidUser = userService.login(username, password);
 
        if(isValidUser) {
            return "mainpage";
        } else {
           
            return "failed";
        }
    }
 
    public String getUsername() {return username;}
    public void setUsername(String username) {this.username = username;}
 
    public String getPassword() {return password;}
    public void setPassword(String password) {this.password = password;}
    
    
}
