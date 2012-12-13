/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.mbeans;

import com.jsf.util.JsfUtil;
import control.serviceimplem.PublicationService;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import model.Publication;

/**
 *
 * @author kate
 */
@ManagedBean(name = "addpublMB")
@ViewScoped
public class AddPublmanagedBean {

    @EJB
    private PublicationService publicationService;
    private Publication currpubl = new Publication();
    @ManagedProperty(value = "#{userManagedBean}")
    private UserManagedBean usrMB;
    private String selectedItem;
    private String selectedItemNews;
    private String selectedItemTrMethod;
    private String selectedItemDiet;
    private Map<String, String> items;

    public AddPublmanagedBean() {
//        items = new LinkedHashMap<String, String>();
//        items.put("Новость", "NEWS");
//        items.put("Диета", "DIET");
//        items.put("Методика тренировок", "TRAININGMETHOD");
    }

    /**
     * @return the currpubl
     */
    public Publication getCurrpubl() {
        return currpubl;
    }

    /**
     * @param currpubl the currpubl to set
     */
    public void setCurrpubl(Publication currpubl) {
        this.currpubl = currpubl;
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

    public void addPubl() {
//        selectedItem = this.getSelectedItem();
//        String selectedLabel = items.get(selectedItem);

        System.out.println(currpubl.getText());
        System.out.println(currpubl.getTitle());
        if ((currpubl.getText() != null) || (null != currpubl.getTitle())) {

            currpubl.setDate_publ(java.util.Calendar.getInstance().getTime());
            currpubl.setAutor(usrMB.getCurrentUser());
            currpubl.setType(selectedItem);
            publicationService.create(currpubl);
            try {
                FacesContext.getCurrentInstance().getExternalContext().redirect("/Triary-war/news.xhtml");

            } catch (IOException ex) {
                Logger.getLogger(UserManagedBean.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JsfUtil.addErrorMessage("Put some text and title!");
        }

    }

    /**
     * @return the selectedItem
     */
    public String getSelectedItemNews() {
        return selectedItemNews;
    }

    /**
     * @param selectedItem the selectedItem to set
     */
    public void setSelectedItemNews(String selectedItemNews) {
        this.selectedItemNews = selectedItemNews;
    }

    /**
     * @return the selectedItemTrMethod
     */
    public String getSelectedItemTrMethod() {
        return selectedItemTrMethod;
    }

    /**
     * @param selectedItemTrMethod the selectedItemTrMethod to set
     */
    public void setSelectedItemTrMethod(String selectedItemTrMethod) {
        this.selectedItemTrMethod = selectedItemTrMethod;
    }

    /**
     * @return the selectedItemDiet
     */
    public String getSelectedItemDiet() {
        return selectedItemDiet;
    }

    /**
     * @param selectedItemDiet the selectedItemDiet to set
     */
    public void setSelectedItemDiet(String selectedItemDiet) {
        this.selectedItemDiet = selectedItemDiet;
    }

    /**
     * @return the selectedItem
     */
    public String getSelectedItem() {
        return selectedItem;
    }

    /**
     * @param selectedItem the selectedItem to set
     */
    public void setSelectedItem(String selectedItem) {
        this.selectedItem = selectedItem;
    }

    /**
     * @return the items
     */
    public Map<String, String> getItems() {
        return items;
    }
}
