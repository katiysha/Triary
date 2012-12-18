/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.mbeans;

import control.serviceimplem.UserService;
import java.io.IOException;
import java.security.Principal;
import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.naming.AuthenticationException;
import javax.naming.Context;
import javax.naming.NamingException;
import javax.naming.ldap.InitialLdapContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Users;

/**
 *
 * @author kate
 */
@ManagedBean(name = "userManagedBean")
@SessionScoped
public class UserManagedBean {

    @EJB
    private UserService userService;
    private Users currentUser;
    private String login;
    private String password;
    private String role;
    public static String ldapUri = "ldap://localhost:1389/dc=triary,dc=com";
    public static String usersContainer = "dc=triary,dc=com";

    public String getHello() {
        if (currentUser != null) {
            return "Welcome, " + currentUser.getLogin() + "!";
        }
        return null;
    }

    public String getLoginUserName() {
        Principal loginUser = getLoggedInUser();
        if (loginUser != null) {
            this.currentUser = userService.getByLogin(loginUser.getName());
            this.role = currentUser.getRoleuser();
            return loginUser.getName();
        }
        return "Гость";
    }

    private Principal getLoggedInUser() {
        HttpServletRequest request =
                (HttpServletRequest) FacesContext.getCurrentInstance().
                getExternalContext().getRequest();
        return request.getUserPrincipal();
    }

    public Users getCurrentUser() {
        return currentUser;
    }

    public boolean isAdminOrModer() {
        if (currentUser != null) {
            if ((currentUser.getRoleuser().equals("admin")) || (currentUser.getRoleuser().equals("moder"))) {
                return true;
            }
        }
        return false;
    }

    public void checkPasswd() throws IOException {

        //if (userService.login(login, password)) {

        this.currentUser = userService.getByLogin(getLoginUserName());

        this.role = currentUser.getRoleuser();

        login = "";
        password = "";
        
        try {
            FacesContext.getCurrentInstance().getExternalContext().redirect("http://localhost:8082/Triary-war/news.xhtml");

            return;
        } catch (IOException ex) {
            Logger.getLogger(UserManagedBean.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void logout() {
        currentUser = null;
        HttpServletRequest request =
                (HttpServletRequest) FacesContext.getCurrentInstance().
                getExternalContext().getRequest();

        Principal loginUser = getLoggedInUser();
        if (loginUser != null) {
            HttpSession session = request.getSession(false);
            if (session != null) {
                session.invalidate();
                try {
                    FacesContext.getCurrentInstance().getExternalContext().redirect("/Triary-war/index.xhtml");

                } catch (IOException ex) {
                    Logger.getLogger(UserManagedBean.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }

    public UserManagedBean() {
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    public boolean auth() {
        String username = this.login;
        String password = this.password;

        if (username != null && password != null) {
            return false;
        }
        Hashtable env = new Hashtable();
        env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
        env.put(Context.PROVIDER_URL, ldapUri);
        env.put(Context.SECURITY_PRINCIPAL, "cn=" + username + "dc=triary,dc=com");
        env.put(Context.SECURITY_CREDENTIALS, password);
        try {
            new InitialLdapContext(env, null).close();
        } catch (AuthenticationException ae) {
            return false;
        } catch (NamingException ne) {
            throw new RuntimeException(ne);
        }
        try {
            FacesContext.getCurrentInstance().getExternalContext().redirect("/Triary-war/faces/index.xhtml");

        } catch (IOException ex) {
            Logger.getLogger(UserManagedBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
}
