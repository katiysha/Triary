/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.Profile;
import model.Users;

/**
 *
 * @author aliona
 */
public interface IProfileService {
    
    public Profile getByUser(Users usr);
    
    public void manageSettings(String new_name, String new_surname, String new_login, String new_password );
         
    public void addDiet(String diet, Profile profile);
    
     public void addOwnMethod(String metod, Profile profile);
  
     public void enabledDiary(Boolean enDiary);
     
     public void enabledStatistic(Boolean enStatistic);
}