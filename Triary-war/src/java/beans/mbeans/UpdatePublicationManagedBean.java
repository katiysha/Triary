/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.mbeans;

import control.serviceimplem.PublicationService;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import model.Publication;

/**
 *
 * @author kate
 */
@ManagedBean (name = "updatemb")
@ViewScoped
public class UpdatePublicationManagedBean {
    @EJB
    private PublicationService publicationService;
    private Publication updatePubl;

    /**
     * @return the updatePubl
     */
    public Publication getUpdatePubl() {
        return updatePubl;
    }

    /**
     * @param updatePubl the updatePubl to set
     */
    public void setUpdatePubl(Publication updatePubl) {
        this.updatePubl = updatePubl;
    }
    
    public void updateNews (){
    publicationService.edit(updatePubl);
    
   // updatePubl = null;
     try {   FacesContext.getCurrentInstance().getExternalContext().redirect("/Triary-war/news.xhtml");
               
            } catch (IOException ex) {
               Logger.getLogger(UserManagedBean.class.getName()).log(Level.SEVERE, null, ex);
            }
   }
    
   @PostConstruct
    public void init() {
        String id_new = ((HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest()).getParameter("idpubl");
        Integer id = new Integer(id_new);
        try {
            updatePubl = (Publication) publicationService.find(new Integer(id));
            System.out.println(((HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest()).getQueryString());
            System.out.print(updatePubl.getText());

        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
