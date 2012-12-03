/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import control.serviceimplem.CommentService;
import control.serviceimplem.UserService;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import model.Comment;
import model.Users;

/**
 *
 * @author aliona
 */
@ManagedBean(name="commentController")
@RequestScoped
@Controller
public class CommentController {
    private CommentService commentService;
    private FacesMessage messages;
        private List<Comment> com_list;
        
     @Inject
    public CommentController (CommentService commentService){
        this.commentService=commentService;
    }
    
    @Inject
    public void setFacesMessage(FacesMessage messages){
        this.messages = messages;
    }
public String listGetAll() {
        
        com_list = commentService.getAll();
        
        if(com_list.isEmpty()) {
            return "succed";
        } else {
           
            return "failed";
        }
    }


}
