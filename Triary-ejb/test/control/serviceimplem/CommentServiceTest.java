/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control.serviceimplem;


import controller.CommentController;
import java.util.Calendar;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.embeddable.EJBContainer;
import javax.persistence.Query;
import static org.mockito.Mockito.*;
import model.Comment;
import model.Diary;
import model.Publication;
import model.Users;
import javax.faces.application.FacesMessage;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author kate
 */
public class CommentServiceTest {
    private CommentService commentService;
     private FacesMessage fMessages;
       private CommentController controller;
     public CommentServiceTest() {
    }

        @Before
    public void setUp() {
        commentService = mock(CommentService.class);
        fMessages = mock(FacesMessage.class);
        controller = new CommentController(commentService);
        controller.setFacesMessage(fMessages);
    }
    
    @After
    public void tearDown() {
        controller=null;
    }

   /* @Test
    public void testCreationObject() throws Exception {
        
        Comment commi = new Comment();
      // assertNotNull(commi);
        List<Comment> comms = null;
        commi.setText("dfgh");
        commserv.create(commi);
        
        assertEquals(commi.getText(), "dfgh");
    }*/
    
    @Test
    public void testGetAll() throws Exception {
           
        String result = controller.listGetAll();
        assertNotNull(result);
        assertEquals("succed", result);
               }
    }
    
   
    
    /**
     * Test of getByPublication method, of class CommentService.
     */
  /*  @Test
    public void testGetByPublication() throws Exception {
        Users usr = new Users();
        usr.setEmail("a@b.com");
        usr.setLogin("log");
        users.add(usr);
        Publication publication = new Publication();
        publication.setText("This is News");
        publication.setDate(Calendar.getInstance().getTime());
        publication.setDate_publ(Calendar.getInstance().getTime());
        publication.setTitle("Title");
        publication.setSubtext("new news");
        publication.setAutor(users.get(1));
        publ.add(publication);
        Comment com = new Comment();
        com.setAutor(usr);
        com.setText("Comment");
        publication.addComment(com);
        comm.add(com);
        
        System.out.println("getByPublication");
        
        
        CommentService instance = new CommentService();
        
        List result = instance.getByPublication(publication);
        assertNotNull(result);
        
  }

    /**
     * Test of getByDiary method, of class CommentService.
     */
   /* @Test
    public void testGetByDiary() throws Exception {
        Users usr = new Users();
        usr.setEmail("a@b.com");
        usr.setLogin("log");
        users.add(usr);
        Publication publication = new Publication();
        publication.setText("This is News");
        publication.setDate(Calendar.getInstance().getTime());
        publication.setDate_publ(Calendar.getInstance().getTime());
        publication.setTitle("Title");
        publication.setSubtext("new news");
        publication.setAutor(users.get(1));
        publ.add(publication);
        Comment com = new Comment();
        com.setAutor(usr);
        com.setText("Comment");
        publication.addComment(com);
        comm.add(com);
        Diary diary = new Diary("Bodybuilding", "Back", "Dead lift", null, Integer.MIN_VALUE, null);
        diaries.add(diary);
        System.out.println("getByDiary");
        
        CommentService instance = new CommentService();
        
        List result = instance.getByDiary(diary);
        assertNotNull(result);
        
    }*/

    /**
     * Test of addComment method, of class CommentService.
     */
  /*  @Test
    public void testAddComment_3args_1() throws Exception {
        Users usr = new Users();
        usr.setEmail("a@b.com");
        usr.setLogin("log");
        users.add(usr);
        Publication publication = new Publication();
        publication.setText("This is News");
        publication.setDate(Calendar.getInstance().getTime());
        publication.setDate_publ(Calendar.getInstance().getTime());
        publication.setTitle("Title");
        publication.setSubtext("new news");
        publication.setAutor(users.get(1));
        publ.add(publication);
        Comment com = new Comment();
        com.setAutor(usr);
        com.setText("Comment");
        publication.addComment(com);
        comm.add(com);
        Diary diary = new Diary("Bodybuilding", "Back", "Dead lift", null, Integer.MIN_VALUE, null);
        diaries.add(diary);
        
        System.out.println("addComment");
        
        CommentService instance = new CommentService();
        boolean result = instance.addComment(com, publication, usr);
        assertNotNull(result);
        
    }*/

    /**
     * Test of removeComment method, of class CommentService.
     */
   /*  @Test
   public void testRemoveComment_3args_1() throws Exception {
        Users usr = new Users();
        usr.setEmail("a@b.com");
        usr.setLogin("log");
        users.add(usr);
        Publication publication = new Publication();
        publication.setText("This is News");
        publication.setDate(Calendar.getInstance().getTime());
        publication.setDate_publ(Calendar.getInstance().getTime());
        publication.setTitle("Title");
        publication.setSubtext("new news");
        publication.setAutor(users.get(1));
        publ.add(publication);
        Comment com = new Comment();
        com.setAutor(usr);
        com.setText("Comment");
        publication.addComment(com);
        comm.add(com);
        Diary diary = new Diary("Bodybuilding", "Back", "Dead lift", null, Integer.MIN_VALUE, null);
        diaries.add(diary);
        
        System.out.println("removeComment");
        
        
        CommentService instance = new CommentService();
        
        boolean result = instance.removeComment(com, publication, usr);
        assertNull(result);
        
    }*/

    /**
     * Test of addComment method, of class CommentService.
     */
   /* @Test
    public void testAddComment_3args_2() throws Exception {
        Users usr = new Users();
        usr.setEmail("a@b.com");
        usr.setLogin("log");
        users.add(usr);
        Publication publication = new Publication();
        publication.setText("This is News");
        publication.setDate(Calendar.getInstance().getTime());
        publication.setDate_publ(Calendar.getInstance().getTime());
        publication.setTitle("Title");
        publication.setSubtext("new news");
        publication.setAutor(users.get(1));
        publ.add(publication);
        Comment com = new Comment();
        com.setAutor(usr);
        com.setText("Comment");
        publication.addComment(com);
        comm.add(com);
        Diary diary = new Diary("Bodybuilding", "Back", "Dead lift", null, Integer.MIN_VALUE, null);
        diaries.add(diary);
        
        System.out.println("addComment");
        
        CommentService instance = new CommentService();
        
        boolean result = instance.addComment(com, diary, usr);
        assertNotNull(result);
        
    }*/

    /**
     * Test of removeComment method, of class CommentService.
     */
    /*@Test
    public void testRemoveComment_3args_2() throws Exception {
        Users usr = new Users();
        usr.setEmail("a@b.com");
        usr.setLogin("log");
        users.add(usr);
        Publication publication = new Publication();
        publication.setText("This is News");
        publication.setDate(Calendar.getInstance().getTime());
        publication.setDate_publ(Calendar.getInstance().getTime());
        publication.setTitle("Title");
        publication.setSubtext("new news");
        publication.setAutor(users.get(1));
        publ.add(publication);
        Comment com = new Comment();
        com.setAutor(usr);
        com.setText("Comment");
        publication.addComment(com);
        comm.add(com);
        Diary diary = new Diary("Bodybuilding", "Back", "Dead lift", null, Integer.MIN_VALUE, null);
        diaries.add(diary);
        
        System.out.println("removeComment");
        
        CommentService instance = new CommentService();
        
        boolean result = instance.removeComment(com, diary, usr);
        assertNull(result);
        
    }*/

