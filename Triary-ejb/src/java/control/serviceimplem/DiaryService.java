/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control.serviceimplem;

import control.IDiaryService;
import java.sql.Time;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Diary;
import model.Users;

/**
 *
 * @author aliona
 */

<<<<<<< HEAD
@Stateless
=======
   @Stateless
>>>>>>> 13fc261df3b4eff10e3f2df1d8817ca0a9b1ec13
@LocalBean
public class DiaryService extends Generic<Diary> implements IDiaryService{


    @PersistenceContext(unitName = "Triary-ejbPU")
    private EntityManager em;

   public DiaryService(){
       super(Diary.class);
   }
    
    public void persist(Object object) {
        em.persist(object);
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
    @Override
    public void addRecord(Users usr, String training_type, String muscle_gr,  String tasks, String tr_duration, Integer repeat_amount, String fillings) {
            Diary diary = new Diary(training_type, muscle_gr, tasks, tr_duration, repeat_amount, fillings);
            diary.setOwner(usr);
            create(diary);
    }

    @Override
    public String selectTrainingType(Integer index) {
        List<String> type = null;
        type = em.createNamedQuery("selectTrainingType").getResultList();
        return type.get(index);
    }

     @Override
    public List <String> getTask() {
        List<String> tasks = null;
      return  tasks = em.createNamedQuery("selectTask").getResultList();
      
    }
    
        @Override
    public List<String> getMuscleGroup() {
       List<String> muscl_gr = null;
       muscl_gr = em.createNamedQuery("selectMuscleGroup").getResultList();
           return muscl_gr;
       
    }

    @Override
    public String selectMuscleGroup(Integer index) {
       List<String> muscl_gr = null;
       muscl_gr = em.createNamedQuery("selectMuscleGroup").getResultList();
       return muscl_gr.get(index);
    }

    @Override
    public String selectTask(Integer index) {
        List<String> tasks = null;
        tasks = em.createNamedQuery("selectTask").getResultList();
        return tasks.get(index);
    }

    @Override
    public Long selectWeight(Integer index) {
        List<Long> weights = null;
        weights = em.createNamedQuery("selectWeight").getResultList();
        return weights.get(index);
    }

    @Override
    public Integer selectRepeats(Integer index) {
        List<Integer> repeat_amount = null;
        repeat_amount = em.createNamedQuery("selectRepeats").getResultList();
        return repeat_amount.get(index);
    }

    @Override
    public void addFilings(Diary diary,String filings) {
        diary.setFillings(filings);
        create(diary);
    }
 
} 

<<<<<<< HEAD
=======
     @Override
    public String selectFealings(Integer index) {
        List<String> feallings = null;
        feallings = em.createNamedQuery("selectFeallings").getResultList();
        return feallings.get(index);
    }
} 


>>>>>>> 13fc261df3b4eff10e3f2df1d8817ca0a9b1ec13
