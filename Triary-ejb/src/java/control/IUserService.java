/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.List;
import javax.ejb.Local;
import model.Users;

/**
 *
 * @author kate
 */
@Local
public interface IUserService {
    
    public List<Users> getByUser(Integer id_user);
    
    public List<Users> findByName(String name);
   
    public boolean login (String login, String passwd);
    
    public Users getByLogin (String login);
    
    public boolean registration (Users user);
   
    
   
    
    
    
}