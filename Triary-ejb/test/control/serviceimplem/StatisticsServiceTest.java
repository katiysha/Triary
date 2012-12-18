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
public class StatisticsServiceTest {
    
    public List<Publication> publ;
    public List<Comment> comm;
    public List<Users> users;
    public List<Diary> diaries;
    public List<Statistics> stats;
    public List<Profile> profiles;
    
    public StatisticsServiceTest() {
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
     * Test of getByWeight method, of class StatisticsService.
     */
    @Test
    public void testGetByWeight() {
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
        Profile prof = new Profile("My diet", "My ration", "11", Boolean.TRUE, Boolean.TRUE, null);
        profiles.add(prof);
        System.out.println("getByWeight");
        String weight = diary.getWeight().toString();
        StatisticsService instance = new StatisticsService();
        
        Statistics result = instance.getByWeight(weight);
        assertNotNull(result);
        
    }

    /**
     * Test of getByMuscleGr method, of class StatisticsService.
     */
    @Test
    public void testGetByMuscleGr() {
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
        Profile prof = new Profile("My diet", "My ration", "11", Boolean.TRUE, Boolean.TRUE, null);
        profiles.add(prof);
        System.out.println("getByMuscleGr");
        String muscle_gr = diary.getMuscleGroup();
        StatisticsService instance = new StatisticsService();
        
        Statistics result = instance.getByMuscleGr(muscle_gr);
        assertNotNull(result);
        
    }

    /**
     * Test of getByExercise method, of class StatisticsService.
     */
    @Test
    public void testGetByExercise() {
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
        Profile prof = new Profile("My diet", "My ration", "11", Boolean.TRUE, Boolean.TRUE, null);
        profiles.add(prof);
        System.out.println("getByExercise");
        String ex = diary.getTasks();
        StatisticsService instance = new StatisticsService();
        
        Statistics result = instance.getByExercise(ex);
        assertNotNull(result);
        
    }
}
