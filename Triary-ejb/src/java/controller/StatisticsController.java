/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import control.serviceimplem.StatisticsService;
import control.serviceimplem.UserService;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import model.Statistics;
import model.Users;

/**
 *
 * @author aliona
 */

@ManagedBean(name="statisticsController")
@RequestScoped
@Controller
public class StatisticsController {
    private Integer stat_id;
    private String stat_title;
     private String stat_weight;
     private String stat_muscle;
     private String stat_ex;
    private List<Statistics> type_list;
    private String stat_owner;
    private StatisticsService statisticsService;
    private FacesMessage messages;
    
     /**
     *
     * @param statisticsService
     */
    @Inject
    public StatisticsController (StatisticsService statisticsService){
        this.statisticsService=statisticsService;
    }
    
    @Inject
    public void setFacesMessage(FacesMessage messages){
        this.messages = messages;
    }
    
    public String listByWeight() {
       
        type_list =  (List<Statistics>) statisticsService.getByWeight(stat_weight);
       if(type_list.isEmpty()) {
            return "succed";
        } else {
           
            return "failed";
        }
    }
    public String listByMuscleGr() {
       
        type_list =  (List<Statistics>) statisticsService.getByMuscleGr(stat_muscle);
       if(type_list.isEmpty()) {
            return "succed";
        } else {
           
            return "failed";
        }
    }
    public String listByEx() {
       
        type_list =  (List<Statistics>) statisticsService.getByExercise(stat_ex);
       if(type_list.isEmpty()) {
            return "succed";
        } else {
           
            return "failed";
        }
    }
    
     public String getStat_Title() {return stat_title;}
    public void setStat_Title(String stat_title) {this.stat_title=stat_title;}
 
    public Integer getStat_Id() {return stat_id;}
    public void setStat_Id(Integer stat_id) {this.stat_id=stat_id;}
    
    
}
