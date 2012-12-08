/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import java.util.List;
import model.Publication;
import model.Users;

/**
 *
 * @author aliona
 */
public interface IPublicationService {
     public List<Publication> findByText (String substr);
    
    public List<Publication> findByDate (String date);
    
    public List<Publication> getByTitle (String title);
    
    public List<Publication> getByType (String type);
    
    public List<Publication> getByAutor (Users usr);
    
    public List<Publication> getAll();
    
}
