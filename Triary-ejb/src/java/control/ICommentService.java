/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import model.Comment;
import java.util.List;
import model.*;

/**
 *
 * @author kate
 */
public interface ICommentService {
    public List<Comment> getByPublication(Publication publ);
    
    public List<Comment> getByDiary(Diary diary);
    public List<Comment> getAll();
    
    public boolean addComment (Comment com, Publication pub, Users usr);
 
    public boolean removeComment (Comment com, Publication pub, Users usr);
    
    public boolean addComment (Comment com, Diary diary, Users usr);
 
    public boolean removeComment (Comment com, Diary diary, Users usr);
}
