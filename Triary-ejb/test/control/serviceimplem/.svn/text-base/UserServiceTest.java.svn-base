/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control.serviceimplem;

import java.util.Calendar;
import java.util.List;
import javax.persistence.EntityManager;
import model.*;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author kate
 */
public class UserServiceTest {
    
    public List<Publication> publ;
    public List<Comment> comm;
    public List<Users> users;
    public List<Diary> diaries;
    public List<Statistics> stats;
    public List<Profile> profiles;
    public UserServiceTest() {
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
     * Test of getByUser method, of class UserService.
     */
    @Test
    public void testGetByUser() {
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
        Statistics stat = new Statistics();
        stats.add(stat);
        Profile prof = new Profile("My diet", "My ration", Long.MIN_VALUE, Boolean.TRUE, Boolean.TRUE, null);
        profiles.add(prof);
        
        System.out.println("getByUser");
        Integer usr_id = 1;
        UserService instance = new UserService();
        
        List result = instance.getByUser(usr_id);
        assertNotNull(result);
        
    }

    /**
     * Test of findByName method, of class UserService.
     */
    @Test
    public void testFindByName() {
        Users usr = new Users();
        usr.setEmail("a@b.com");
        usr.setLogin("log");
        usr.setName("Name");
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
        Statistics stat = new Statistics();
        stats.add(stat);
        Profile prof = new Profile("My diet", "My ration", Long.MIN_VALUE, Boolean.TRUE, Boolean.TRUE, null);
        profiles.add(prof);
        
        System.out.println("findByName");
        String name = "Name";
        UserService instance = new UserService();
        
        List result = instance.findByName(name);
        assertNotNull(result);
        
    }

    /**
     * Test of enableProfile method, of class UserService.
     */
    @Test
    public void testEnableProfile() {
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
        Statistics stat = new Statistics();
        stats.add(stat);
        Profile prof = new Profile("My diet", "My ration", Long.MIN_VALUE, Boolean.TRUE, Boolean.TRUE, null);
        profiles.add(prof);
        
        System.out.println("enableProfile");
        UserService instance = new UserService();
        
        boolean result = instance.enableProfile();
        assertNotNull(result);
        
    }

    /**
     * Test of addRation method, of class UserService.
     */
    @Test
    public void testAddRation() {
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
        Statistics stat = new Statistics();
        stats.add(stat);
        Profile prof = new Profile("My diet", "My ration", Long.MIN_VALUE, Boolean.TRUE, Boolean.TRUE, null);
        profiles.add(prof);
        
        System.out.println("addRation");
        String ration = "Ration";
        UserService instance = new UserService();
        instance.addRation(ration);
        assertNotNull(instance);
    }

    /**
     * Test of addDiet method, of class UserService.
     */
    @Test
    public void testAddDiet() {
        System.out.println("addDiet");
        String diet = "";
        UserService instance = new UserService();
        instance.addDiet(diet);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of enableStatistics method, of class UserService.
     */
    @Test
    public void testEnableStatistics() {
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
        Statistics stat = new Statistics();
        stats.add(stat);
        Profile prof = new Profile("My diet", "My ration", Long.MIN_VALUE, Boolean.TRUE, Boolean.TRUE, null);
        profiles.add(prof);
        
        System.out.println("enableStatistics");
        UserService instance = new UserService();
        
        boolean result = instance.enableStatistics();
        assertNotNull(result);
        
    }
}
