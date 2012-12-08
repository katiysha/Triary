/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.mbeans;

import control.IPublicationService;
import control.serviceimplem.PublicationService;
import control.serviceimplem.UserService;
import java.io.IOException;
import java.security.Principal;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import model.Publication;
import model.Users;
import model.baseclass.PublicType;

/**
 *
 * @author kate
 */
@ManagedBean(name = "testMB")
@SessionScoped
public class TestBean {
    
//    @EJB(mappedName="UserService")
//    private UserService userService;
    private Users currentUser;
    private String login;
    private String password;
    private int role;
    private List<Publication> lstAll;
    @EJB
    private PublicationService PublicationService;

    
    public void setLstPublication() {
//       Publication publ = new Publication();
//       publ.setTitle("Title");
//       publ.setText("Text");
//       publ.setType("NEWS");
//       publ.setAutor(currentUser);
//       publ.setSubtext("111");
//       lstAll.add(publ);
       lstAll = (List<Publication>) PublicationService.getAll();
    }
    
    public List<Publication> getLstNews() {
        setLstPublication();
        return lstAll;
    }
    
    public String getHello() {
        if (currentUser != null) {
            return "Welcome, " + currentUser.getLogin() + "!";
        }
        return null;
    }
    public TestBean() {
    }
}
