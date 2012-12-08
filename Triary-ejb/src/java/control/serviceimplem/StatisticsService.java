/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control.serviceimplem;


import control.IStatisticsService;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Publication;
import model.Statistics;

/**
 *
 * @author kate
 */
@Stateless
@LocalBean
public class StatisticsService extends Generic<Statistics> implements IStatisticsService{

    @PersistenceContext(unitName = "Triary-ejbPU")
    private EntityManager em;

    public StatisticsService() {
        super(Statistics.class);
    }
    
    public void persist(Object object) {
        em.persist(object);
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
    @Override
    public Statistics getByWeight(String weight) {
        return (Statistics) em.createNamedQuery("Statistics.getByWeight").setParameter("weight", weight).getResultList();
    }

    @Override
    public Statistics getByMuscleGr(String muscle_gr) {
        return (Statistics) em.createNamedQuery("Statistics.getByMuscleGr").setParameter("muscle_gr", muscle_gr).getResultList();
    }

    @Override
    public Statistics getByExercise(String ex) {
        return (Statistics) em.createNamedQuery("Statistics.getByExercise").setParameter("ex", ex).getResultList();
    }

   
    
}
