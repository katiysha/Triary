/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control.serviceimplem;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import model.Comment;
import model.Publication;
import model.Users;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author kate
 */
public class PublicationServiceTest {
    
    public List<Publication> publ;
    public List<Comment> comm;
    public List<Users> users;
    
    public PublicationServiceTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of findByText method, of class PublicationService.
     */
    @Test
    public void testFindByText() {

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
        
        System.out.println("findByText");
        String substr = publication.getText();
        PublicationService instance = new PublicationService();
        
        List result = instance.findByText(substr);
        assertNotNull(result);
        
    }

    /**
     * Test of findByDate method, of class PublicationService.
     */
    @Test
    public void testFindByDate() {
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
        
        System.out.println("findByDate");
        Date date = Calendar.getInstance().getTime();
        PublicationService instance = new PublicationService();
        
        List result = instance.findByDate(date.toString());
        assertNotNull(result);
    }

    /**
     * Test of getByTitle method, of class PublicationService.
     */
    @Test
    public void testGetByTitle() {
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
        
        System.out.println("getByTitle");
        String title = "Title";
        PublicationService instance = new PublicationService();
        
        List result = instance.getByTitle(title);
        assertNotNull(result);
        
    }

    /**
     * Test of getByType method, of class PublicationService.
     */
    @Test
    public void testGetByType() {
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
        publication.setType("NEWS");
        publ.add(publication);
        
        System.out.println("getByType");
        String type = "NEWS";
        PublicationService instance = new PublicationService();
        
        List result = instance.getByType(type);
        assertNotNull(result);
        
    }

    /**
     * Test of getByAutor method, of class PublicationService.
     */
    @Test
    public void testGetByAutor() {
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
        publication.setType("NEWS");
        publ.add(publication);
        
        System.out.println("getByAutor");
        
        PublicationService instance = new PublicationService();
        
        List result = instance.getByAutor(usr);
        assertNotNull(result);
        
    }
   
}
