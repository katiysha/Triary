/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.List;
import model.Users;

/**
 *
 * @author kate
 */
public interface IUserService {
    
    public List<Users> getByUser(Integer usr_id);
    
    public List<Users> findByName(String name);
    
    public boolean enableProfile();
    
    public void addRation(String ration);
    
    public void addDiet(String diet);
    
    public boolean enableStatistics();
    
    
    
}