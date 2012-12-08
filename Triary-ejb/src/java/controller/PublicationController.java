/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import control.serviceimplem.PublicationService;

import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import model.Publication;


/**
 *
 * @author aliona
 */
@ManagedBean(name="publicationController")
@RequestScoped
@Controller
public class PublicationController {

    private String publ_type;
    private String publ_date;
    private List<Publication> publ_list;
      private PublicationService publicationService;
    private FacesMessage messages;
    
     /**
     *
     * @param publicationService
     */
    @Inject
    public PublicationController (PublicationService publicationService){
        this.publicationService = publicationService;
    }
    
    /**
     *
     * @param messages
     */
    @Inject
    public void setFacesMessage(FacesMessage messages){
        this.messages = messages;
    }
    
     public String listByType() {
        
        publ_list = publicationService.getByType(publ_type);
        
        if(publ_list.isEmpty()) {
            return "succed";
        } else {
           
            return "failed";
        }
    }
    
    public String listByDate() {
        
        publ_list = publicationService.findByDate(publ_date);
        
        Integer size = publ_list.size();
        
        if(size != 0) {
            return "succed";
        } else {
           
            return "failed";
        }
    }
    
    public String getPubl_Type() {
        return publ_type;}
  
    public void setPubl_Type(String publ_type) {
        this.publ_type=publ_type;}
 
    public String getPublication_Date() {
        return publ_date;}
   
    public void setPublication_Date(String publ_date) {
        this.publ_date=publ_date;
    }   
}