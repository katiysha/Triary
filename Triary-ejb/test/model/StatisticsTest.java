/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author kate
 */
public class StatisticsTest {
    public List<Publication> publ;
    public List<Comment> comm;
    public List<Users> users;
    public List<Diary> diaries;
    public List<Statistics> stats;
    public List<Profile> profiles;
    
    public StatisticsTest() {
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
     * Test of addWeightStat method, of class Statistics.
     */
    @Test
    public void testAddWeightStat() {
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
        
        System.out.println("addWeightStat");
        
        
        HashMap result = stat.addWeightStat();
        assertNotNull(result);
    }

    /**
     * Test of addMuscleStat method, of class Statistics.
     */
    @Test
    public void testAddMuscleStat() {
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
        
        System.out.println("addMuscleStat");
        HashMap result = stat.addMuscleStat();
        assertNotNull(result);
        
    }

    /**
     * Test of addExerciseStat method, of class Statistics.
     */
    @Test
    public void testAddExerciseStat() {
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
        
        System.out.println("addExerciseStat");
        HashMap result = stat.addExerciseStat();
        assertNotNull(result);
        
    }

    /**
     * Test of getType method, of class Statistics.
     */
    @Test
    public void testGetType() {
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
        stat.setType(1);
        stats.add(stat);
        Profile prof = new Profile("My diet", "My ration", "11", Boolean.TRUE, Boolean.TRUE, null);
        profiles.add(prof);
        
        System.out.println("getType");
        String expResult = "Weight/Time";
        Integer result = stat.getType();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getTitle method, of class Statistics.
     */
    @Test
    public void testGetTitle() {
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
        stat.setType(1);
        stat.setTitle("Weight/Time");
        stats.add(stat);
        Profile prof = new Profile("My diet", "My ration", "11", Boolean.TRUE, Boolean.TRUE, null);
        profiles.add(prof);
        
        System.out.println("getTitle");
        
        String expResult = "Weight/Time";
        String result = stat.getTitle();
        assertEquals(expResult, result);
        
    }

    
    /**
     * Test of getOwner method, of class Statistics.
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
        stat.setType(1);
        stat.setOwner(usr);
        stats.add(stat);
        Profile prof = new Profile("My diet", "My ration", "11", Boolean.TRUE, Boolean.TRUE, null);
        profiles.add(prof);
        
        System.out.println("getOwner");
        Users result = stat.getOwner();
        assertNotNull(result);
    }

    
}
