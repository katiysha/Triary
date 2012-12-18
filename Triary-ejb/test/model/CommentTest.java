/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.security.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author kate
 */
public class CommentTest {
    
    public List<Publication> publ;
    public List<Comment> comm;
    public List<Users> users;
    public List<Diary> diaries;
    public List<Statistics> stats;
    public List<Profile> profiles;
    
    public CommentTest() {
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
     * Test of getText method, of class Comment.
     */
    @Test
    public void testGetText() {
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
        
        System.out.println("getText");
        
        String expResult = "Comment";
        String result = com.getText();
        assertEquals(expResult, result);
        
    }

    

    /**
     * Test of getDatecomm method, of class Comment.
     */
    @Test
    public void testGetDatecomm() {
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
        Date date = new Date();
        //Timestamp time = new Timestamp(date, null);
        com.setDatecomm(date);
        publication.addComment(com);
        comm.add(com);
        Diary diary = new Diary("Bodybuilding", "Back", "Dead lift", null, Integer.MIN_VALUE, null);
        diaries.add(diary);
        Statistics stat = new Statistics();
        stats.add(stat);
        Profile prof = new Profile("My diet", "My ration", "11", Boolean.TRUE, Boolean.TRUE, null);
        profiles.add(prof);
        
        System.out.println("getDatecomm");
        
        Date expResult = date;
        Date result = com.getDatecomm();
        assertEquals(expResult, result);
        
    }

    
    /**
     * Test of getPublication method, of class Comment.
     */
    @Test
    public void testGetPublication() {
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
        Date date = new Date();
        //Timestamp time = new Timestamp(date, null);
        com.setDatecomm(date);
        publication.addComment(com);
        comm.add(com);
        Diary diary = new Diary("Bodybuilding", "Back", "Dead lift", null, Integer.MIN_VALUE, null);
        diaries.add(diary);
        Statistics stat = new Statistics();
        stats.add(stat);
        Profile prof = new Profile("My diet", "My ration", "11", Boolean.TRUE, Boolean.TRUE, null);
        profiles.add(prof);
        
        System.out.println("getPublication");
        
        
        Publication result = com.getPublication();
        assertNotNull(result);
        
    }

    
    /**
     * Test of getDiary method, of class Comment.
     */
    @Test
    public void testGetDiary() {
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
        Date date = new Date();
        //Timestamp time = new Timestamp(date, null);
        com.setDatecomm(date);
        publication.addComment(com);
        comm.add(com);
        Diary diary = new Diary("Bodybuilding", "Back", "Dead lift", null, Integer.MIN_VALUE, null);
        diaries.add(diary);
        Statistics stat = new Statistics();
        stats.add(stat);
        Profile prof = new Profile("My diet", "My ration", "11", Boolean.TRUE, Boolean.TRUE, null);
        profiles.add(prof);
        
        System.out.println("getDiary");
        
        Diary result = com.getDiary();
        assertNotNull(result);
    }

    

    /**
     * Test of getAutor method, of class Comment.
     */
    @Test
    public void testGetAutor() {
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
        Date date = new Date();
       // Timestamp time = new Timestamp(date, null);
        com.setDatecomm(date);
        publication.addComment(com);
        comm.add(com);
        Diary diary = new Diary("Bodybuilding", "Back", "Dead lift", null, Integer.MIN_VALUE, null);
        diaries.add(diary);
        Statistics stat = new Statistics();
        stats.add(stat);
        Profile prof = new Profile("My diet", "My ration", "11", Boolean.TRUE, Boolean.TRUE, null);
        profiles.add(prof);
        
        System.out.println("getAutor");
        
        Users result = com.getAutor();
        assertNotNull(result);
        
    }

    
}
