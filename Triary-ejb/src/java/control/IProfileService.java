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
    
    public void manageSettings();
    
    public void addParameters();
    
    public void viewStatistics();
    
    public void addAddons();
   
}