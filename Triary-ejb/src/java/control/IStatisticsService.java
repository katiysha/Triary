/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.Statistics;

/**
 *
 * @author kate
 */
public interface IStatisticsService {
    
   public Statistics getByWeight(String weight);
   
   public Statistics getByMuscleGr(String muscle_gr);
   
   public Statistics getByExercise(String ex);
    
}