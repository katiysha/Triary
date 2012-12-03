/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import control.serviceimplem.DiaryService;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import model.Diary;


/**
 *
 * @author aliona
 */
@ManagedBean(name="diaryController")
@RequestScoped
@Controller
public class DiaryController {
  
   private Diary diary;
    private DiaryService diaryService;
    private FacesMessage messages;
          //  private List<Diary> d_list;
    String d_list;        
    Integer id_task;
    Integer id_muscle;
    
     @Inject
     public DiaryController (DiaryService diaryService){
        this.diaryService=diaryService;
    }
   
    @Inject
    public void setFacesMessage(FacesMessage messages){
        this.messages = messages;
    }
    public String listSelectTask() {
        return d_list = diaryService.selectTask(id_task);
           }
    
    @Inject 
    public String selectMuscleById (){
    d_list = diaryService.selectMuscleGroup(id_muscle);    
    if(d_list == null){
    return "empty";
    }else {return "notempty";}
    }
    
    @Inject
    public String selectByTrainingType (Integer id_task) {
    d_list = diaryService.selectTrainingType(id_task);
    if (d_list ==null){
    return "empty";
        }else {
    return "notempty";}
           }
      /**
       * 
     *
     * @return
     */
     public Integer getId_task() {return id_task;}
    public void setId_task(Integer id_task) {this.id_task=id_task;}
    
     public Integer getId_muscle() {return id_muscle;}
    public void setId_muscle(Integer id_muscle) {
        this.id_muscle=id_muscle;}

  
        public DiaryController(Diary diary) {
        this.diary=diary;
    }
    
    
}
