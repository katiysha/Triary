/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import control.serviceimplem.PublicationService;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author kate
 */

public class PublicationTest {
    
    public List<Publication> publ;
    public List<Comment> comm;
    public List<Users> users;
    @EJB
    private PublicationService publicationService;
    
    public PublicationTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
        publicationService = new PublicationService();
    }
    
    @After
    public void tearDown() {
        publicationService = null;
    }

    /**
     * Test of addComment method, of class Publication.
     */
    @Test
    public void method(){
        try{
        publ = (List<Publication>) publicationService.getAll();
        
        for (Publication pub : publ){
            assertNotNull(pub.getText());
        }
        } catch (NullPointerException e){
                e.getStackTrace();
        }
    }
    
    @Test
    public void testAddComment() {
        Users usr = new Users();
        usr.setEmail("a@b.com");
        usr.setLogin("log");
        users.add(usr);
        Publication instance = new Publication();
        instance.setText("This is News");
        instance.setDate(Calendar.getInstance().getTime());
        instance.setDate_publ(Calendar.getInstance().getTime());
        instance.setTitle("Title");
        instance.setAutor(users.get(1));
        publ.add(instance);
        
        System.out.println("addComment");
        Comment com = new Comment();
        com.setAutor(usr);
        com.setText("Comment");
        instance.addComment(com);
        comm.add(com);
        assertNotNull(comm);
    }

    /**
     * Test of delComment method, of class Publication.
     */
    @Test
    public void testDelComment() {
        Users usr = new Users();
        usr.setEmail("a@b.com");
        usr.setLogin("log");
        users.add(usr);
        Publication instance = new Publication();
        instance.setText("This is News");
        instance.setDate(Calendar.getInstance().getTime());
        instance.setDate_publ(Calendar.getInstance().getTime());
        instance.setTitle("Title");
        instance.setAutor(users.get(1));
        publ.add(instance);
        
        System.out.println("delComment");
        Comment com = new Comment();
        com.setAutor(usr);
        com.setText("Comment");
        instance.delComment(com);
        assertNull(comm);
    }

    /**
     * Test of getDate_publ method, of class Publication.
     */
    @Test
    public void testGetDate_publ() {
        Users usr = new Users();
        usr.setEmail("a@b.com");
        usr.setLogin("log");
        users.add(usr);
        Publication instance = new Publication();
        instance.setText("This is News");
        instance.setDate(Calendar.getInstance().getTime());
        instance.setDate_publ(Calendar.getInstance().getTime());
        instance.setTitle("Title");
        instance.setAutor(users.get(1));
        publ.add(instance);
        
        System.out.println("getDate_publ");
        
        Date expResult = Calendar.getInstance().getTime();
        Date result = instance.getDate_publ();
        assertEquals(expResult, result);
        
    }

    
    /**
     * Test of getText method, of class Publication.
     */
    @Test
    public void testGetText() {
        Users usr = new Users();
        usr.setEmail("a@b.com");
        usr.setLogin("log");
        users.add(usr);
        Publication instance = new Publication();
        instance.setText("This is News");
        instance.setDate(Calendar.getInstance().getTime());
        instance.setDate_publ(Calendar.getInstance().getTime());
        instance.setTitle("Title");
        instance.setAutor(users.get(1));
        publ.add(instance);
        
        System.out.println("getText");
        
        String expResult = "This is News";
        String result = instance.getText();
        assertEquals(expResult, result);
        
    }


    /**
     * Test of getDate method, of class Publication.
     */
    @Test
    public void testGetDate() {
        Users usr = new Users();
        usr.setEmail("a@b.com");
        usr.setLogin("log");
        users.add(usr);
        Publication instance = new Publication();
        instance.setText("This is News");
        instance.setDate(Calendar.getInstance().getTime());
        instance.setDate_publ(Calendar.getInstance().getTime());
        instance.setTitle("Title");
        instance.setAutor(users.get(1));
        publ.add(instance);
        
        System.out.println("getDate");
        
        Date expResult = Calendar.getInstance().getTime();
        Date result = instance.getDate();
        assertEquals(expResult, result);
        
    }

    

    /**
     * Test of getType method, of class Publication.
     */
    @Test
    public void testGetType() {
        Users usr = new Users();
        usr.setEmail("a@b.com");
        usr.setLogin("log");
        users.add(usr);
        Publication instance = new Publication();
        instance.setText("This is News");
        instance.setDate(Calendar.getInstance().getTime());
        instance.setDate_publ(Calendar.getInstance().getTime());
        instance.setTitle("Title");
        instance.setAutor(users.get(1));
        instance.setType("NEWS");
        publ.add(instance);
        
        System.out.println("getType");
        
        String expResult = "NEWS";
        String result = instance.getType();
        assertEquals(expResult, result);
        
    }


    /**
     * Test of getCommentList method, of class Publication.
     */
    @Test
    public void testGetCommentList() {
        Users usr = new Users();
        usr.setEmail("a@b.com");
        usr.setLogin("log");
        users.add(usr);
        Publication instance = new Publication();
        instance.setText("This is News");
        instance.setDate(Calendar.getInstance().getTime());
        instance.setDate_publ(Calendar.getInstance().getTime());
        instance.setTitle("Title");
        instance.setAutor(users.get(1));
        publ.add(instance);
        
        System.out.println("getCommentList");
        
        Comment com = new Comment();
        com.setAutor(usr);
        com.setText("Comment");
        instance.addComment(com);
        comm.add(com);
        
        
        List result = instance.getCommentList();
        assertEquals(comm, result);
        
    }

    
    /**
     * Test of getAutor method, of class Publication.
     */
    @Test
    public void testGetAutor() {
        Users usr = new Users();
        usr.setEmail("a@b.com");
        usr.setLogin("log");
        users.add(usr);
        Publication instance = new Publication();
        instance.setText("This is News");
        instance.setDate(Calendar.getInstance().getTime());
        instance.setDate_publ(Calendar.getInstance().getTime());
        instance.setTitle("Title");
        instance.setAutor(users.get(1));
        publ.add(instance);
        
        System.out.println("getAutor");
        
        
        Users result = instance.getAutor();
        assertEquals(users.get(1), result);
        
    }


    /**
     * Test of getSubtext method, of class Publication.
     */
    @Test
    public void testGetSubtext() {
        Users usr = new Users();
        usr.setEmail("a@b.com");
        usr.setLogin("log");
        users.add(usr);
        Publication instance = new Publication();
        instance.setText("This is News");
        instance.setDate(Calendar.getInstance().getTime());
        instance.setDate_publ(Calendar.getInstance().getTime());
        instance.setTitle("Title");
        instance.setSubtext("new news");
        instance.setAutor(users.get(1));
        publ.add(instance);
        
        System.out.println("getSubtext");
        
        String expResult = "new news";
        String result = instance.getSubtext();
        assertEquals(expResult, result);
        
    }


    /**
     * Test of getTitle method, of class Publication.
     */
    @Test
    public void testGetTitle() {
        Users usr = new Users();
        usr.setEmail("a@b.com");
        usr.setLogin("log");
        users.add(usr);
        Publication instance = new Publication();
        instance.setText("This is News");
        instance.setDate(Calendar.getInstance().getTime());
        instance.setDate_publ(Calendar.getInstance().getTime());
        instance.setTitle("Title");
        instance.setSubtext("new news");
        instance.setAutor(users.get(1));
        publ.add(instance);
        
        System.out.println("getTitle");
        
        String expResult = "Title";
        String result = instance.getTitle();
        assertEquals(expResult, result);
        
    }

}
