/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Time;
import java.util.Calendar;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author kate
 */
public class DiaryTest {
    
    public List<Publication> publ;
    public List<Comment> comm;
    public List<Users> users;
    public List<Diary> diaries;
    public List<Statistics> stats;
    public List<Profile> profiles;
    
    public DiaryTest() {
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
     * Test of addComment method, of class Diary.
     */
    @Test
    public void testAddComment() {
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
        
        System.out.println("addComment");
        
        Diary instance = new Diary();
        instance.addComment(com);
        
        assertNotNull(instance);
    }

    /**
     * Test of delComment method, of class Diary.
     */
    @Test
    public void testDelComment() {
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
        
        System.out.println("delComment");
        
        Diary instance = new Diary();
        instance.delComment(com);
        assertNull(instance);
    }

    /**
     * Test of getTrainingType method, of class Diary.
     */
    @Test
    public void testGetTrainingType() {
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
        
        System.out.println("getTrainingType");
        
        String expResult = "Bodybuilding";
        String result = diary.getTrainingType();
        assertEquals(expResult, result);
        
    }

    

    /**
     * Test of getMuscleGroup method, of class Diary.
     */
    @Test
    public void testGetMuscleGroup() {
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
        
        System.out.println("getMuscleGroup");

        String expResult = "Back";
        String result = diary.getMuscleGroup();
        assertEquals(expResult, result);
        
    }

    

    /**
     * Test of getWeight method, of class Diary.
     */
    @Test
    public void testGetWeight() {
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
        
        System.out.println("getWeight");
        
        
        String result = diary.getWeight();
        assertNotNull(result);
        
    }


    /**
     * Test of getTasks method, of class Diary.
     */
    @Test
    public void testGetTasks() {
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
        
        System.out.println("getTasks");
        
        String expResult = "Dead lift";
        String result = diary.getTasks();
        assertEquals(expResult, result);
        
    }


    /**
     * Test of getFillings method, of class Diary.
     */
    @Test
    public void testGetFillings() {
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
        
        System.out.println("getFillings");
        
        String expResult = "";
        String result = diary.getFillings();
        assertEquals(expResult, result);
        
    }


    /**
     * Test of getTrainingDuration method, of class Diary.
     */
    @Test
    public void testGetTrainingDuration() {
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
        
        System.out.println("getTrainingDuration");
        
       
        String result = diary.getTrainingDuration();
        assertNull(result);
        
    }


    /**
     * Test of getRepeatAmount method, of class Diary.
     */
    @Test
    public void testGetRepeatAmount() {
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
        
        System.out.println("getRepeatAmount");
    
        Integer result = diary.getRepeatAmount();
        assertNull(result);
        
    }


    /**
     * Test of getOwner method, of class Diary.
     */
    @Test
    public void testGetOwner() {
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
        
        System.out.println("getOwner");
        
        Users result = diary.getOwner();
        assertEquals(users.get(1), result);
        
    }

    /**
     * Test of getCommentList method, of class Diary.
     */
    @Test
    public void testGetCommentList() {
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
        
        System.out.println("getCommentList");
        
        List result = diary.getCommentList();
        assertEquals(comm, result);
        
    }

 
}
