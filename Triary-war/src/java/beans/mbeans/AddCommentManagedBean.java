/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.mbeans;

import com.jsf.util.JsfUtil;
import control.serviceimplem.CommentService;
import control.serviceimplem.PublicationService;
import control.serviceimplem.UserService;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import model.Comment;
import model.Publication;

/**
 *
 * @author kate
 */

@ManagedBean(name = "addcommMB")
@ViewScoped
public class AddCommentManagedBean {
    @EJB
    private UserService userService;
    @EJB
    private CommentService commentService;
    @EJB
    private PublicationService publicationService;
    private Publication currentPubl;
    private Comment delComm;
    private Comment currComm = new Comment();
    
    @ManagedProperty(value = "#{userManagedBean}")
    private UserManagedBean usrMB;
    
    private String id_comm;
    private String id_news;
    private List<Comment> lstComm;
    
    public AddCommentManagedBean(){}

    /**
     * @return the currentPubl
     */
    public Publication getCurrentPubl() {
        return currentPubl;
    }

    /**
     * @param currentPubl the currentPubl to set
     */
    public void setCurrentPubl(Publication currentPubl) {
        this.currentPubl = currentPubl;
    }

    /**
     * @return the delComm
     */
    public Comment getDelComm() {
        return delComm;
    }

    /**
     * @param delComm the delComm to set
     */
    public void setDelComm(Comment delComm) {
        this.delComm = delComm;
    }

    /**
     * @return the currComm
     */
    public Comment getCurrComm() {
        return currComm;
    }

    /**
     * @param currComm the currComm to set
     */
    public void setCurrComm(Comment currComm) {
        this.currComm = currComm;
    }

    /**
     * @return the usrMB
     */
    public UserManagedBean getUsrMB() {
        return usrMB;
    }

    /**
     * @param usrMB the usrMB to set
     */
    public void setUsrMB(UserManagedBean usrMB) {
        this.usrMB = usrMB;
    }

    /**
     * @return the id_comm
     */
    public String getId_comm() {
        return id_comm;
    }

    /**
     * @param id_comm the id_comm to set
     */
    public void setId_comm(String id_comm) {
        this.id_comm = id_comm;
    }

    /**
     * @return the id_news
     */
    public String getId_news() {
        return id_news;
    }

    /**
     * @param id_news the id_news to set
     */
    public void setId_news(String id_news) {
        this.id_news = id_news;
    }

    /**
     * @return the lstComm
     */
    public List<Comment> getLstComm() {
        return lstComm;
    }

    /**
     * @param lstComm the lstComm to set
     */
    public void setLstComm(List<Comment> lstComm) {
        this.lstComm = lstComm;
    }
    
    public boolean isAvtorComment() {
        if (usrMB.getCurrentUser() == null) {
            return true;
        }
        return false;
    }
    
    public boolean isAvtorCurrUser (Comment comm) {
        if (usrMB.getCurrentUser().getLogin().equals(comm.getAutor().getLogin())){
            return true;
        }
        return false;
    }
    
    public boolean isRegister() {
        if ((usrMB.getCurrentUser() == null) || (usrMB.getCurrentUser().getRoleuser().equals("moder"))) {
            return true;
        }
        return false;
    }
    
    public void addComment() {
        currComm.setDatecomm(java.util.Calendar.getInstance().getTime());
        if (!currComm.getText().equals("")) {
            if (commentService.addComment(currComm, currentPubl, usrMB.getCurrentUser())) {                
                lstComm = commentService.getByPublication(currentPubl);
                currComm.setText("");
            } else {
                JsfUtil.addSuccessMessage("I NE do it!");
            }
        } else {
            JsfUtil.addSuccessMessage("The comment is empty!");
        }
    }
    
    public void delComment() {
        Integer id_c = new Integer(id_comm);
        delComm = commentService.find(new Integer(id_c));
        commentService.removeComment(delComm, currentPubl, delComm.getAutor());
        lstComm = commentService.getByPublication(currentPubl);
        System.out.println(this.id_comm);
    }
    
    @PostConstruct
    public void init() {
        String id_new = ((HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest()).getParameter("id_news");
        Integer id = new Integer(id_new);
        try {
            currentPubl = (Publication) publicationService.find(new Integer(id));
            lstComm = commentService.getByPublication(currentPubl);
            System.out.println(((HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest()).getQueryString());
            
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
    
}
