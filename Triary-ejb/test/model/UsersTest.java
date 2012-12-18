/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Calendar;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author kate
 */
public class UsersTest {
    
    public List<Publication> publ;
    public List<Comment> comm;
    public List<Users> users;
    public List<Diary> diaries;
    public List<Statistics> stats;
    public List<Profile> profiles;
    
    public UsersTest() {
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
     * Test of addRecordIntoDiary method, of class Users.
     */
    @Test
    public void testAddRecordIntoDiary() {
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
        
        System.out.println("addRecordIntoDiary");
        usr.addRecordIntoDiary(diary);
        
    }

    /**
     * Test of addPublication method, of class Users.
     */
    @Test
    public void testAddPublication() {
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
        
        System.out.println("addPublication");
        usr.addPublication(publication);
        assertNotNull(usr.getPublicationList());
    }

    /**
     * Test of delPublication method, of class Users.
     */
    @Test
    public void testDelPublication() {
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
        
        System.out.println("delPublication");
        boolean result = usr.delPublication(publication);
        assertNull(result);
        
    }

    /**
     * Test of addComment method, of class Users.
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
        stat.setType(1);
        stat.setOwner(usr);
        stats.add(stat);
        Profile prof = new Profile("My diet", "My ration", "11", Boolean.TRUE, Boolean.TRUE, null);
        profiles.add(prof);
        
        System.out.println("addComment");
        
        usr.addComment(com);
        assertNotNull(usr.getCommentList());
    }

    /**
     * Test of delComment method, of class Users.
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
        stat.setType(1);
        stat.setOwner(usr);
        stats.add(stat);
        Profile prof = new Profile("My diet", "My ration", "11", Boolean.TRUE, Boolean.TRUE, null);
        profiles.add(prof);
        
        System.out.println("delComment");
       
        boolean result = usr.delComment(com);
        assertNotNull(result);
        
    }

    /**
     * Test of getCommentList method, of class Users.
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
        stat.setType(1);
        stat.setOwner(usr);
        stats.add(stat);
        Profile prof = new Profile("My diet", "My ration", "11", Boolean.TRUE, Boolean.TRUE, null);
        profiles.add(prof);
        
        List result = usr.getCommentList();
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    /**
     * Test of getPublicationList method, of class Users.
     */
    @Test
    public void testGetPublicationList() {
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
        
        System.out.println("getPublicationList");
        List result = usr.getPublicationList();
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    /**
     * Test of getRoleuser method, of class Users.
     */
    @Test
    public void testGetRoleuser() {
        Users usr = new Users();
        usr.setEmail("a@b.com");
        usr.setLogin("log");
        usr.setRoleuser("Administrator");
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
        
        System.out.println("getRoleuser");
        
        String expResult = "Administrator";
        String result = usr.getRoleuser();
        assertEquals(expResult, result);
        
    }

    
    /**
     * Test of getDiary method, of class Users.
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
        
        System.out.println("getDiary");
        
        Diary result = usr.getDiary();
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
}
