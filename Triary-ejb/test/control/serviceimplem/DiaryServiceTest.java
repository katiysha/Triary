/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control.serviceimplem;

import java.sql.Time;
import java.util.Calendar;
import java.util.List;
import javax.ejb.embeddable.EJBContainer;
import model.Comment;
import model.Diary;
import model.Publication;
import model.Users;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author kate
 */
public class DiaryServiceTest {
    
    public List<Publication> publ;
    public List<Comment> comm;
    public List<Users> users;
    public List<Diary> diaries;
    
    public DiaryServiceTest() {
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
     * Test of addRecord method, of class DiaryService.
     */
    @Test
    public void testAddRecord() throws Exception {
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
        
        System.out.println("addRecord");
        DiaryService instance = new DiaryService();
        instance.addRecord(usr, diary.getTrainingType(), diary.getMuscleGroup(), diary.getTasks(), diary.getTrainingDuration(), diary.getRepeatAmount(), diary.getFillings());
        
        assertNotNull(instance);
    }

    /**
     * Test of selectTrainingType method, of class DiaryService.
     */
    @Test
    public void testSelectTrainingType() throws Exception {
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
        
        System.out.println("selectTrainingType");
        Integer index = 1;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        DiaryService instance = (DiaryService)container.getContext().lookup("java:global/classes/DiaryService");
        String expResult = diary.getTrainingType();
        String result = instance.selectTrainingType(index);
        assertEquals(expResult, result);
        container.close();
        
    }

    /**
     * Test of selectMuscleGroup method, of class DiaryService.
     */
    @Test
    public void testSelectMuscleGroup() throws Exception {
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
        
        System.out.println("selectMuscleGroup");
        Integer index = 1;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        DiaryService instance = (DiaryService)container.getContext().lookup("java:global/classes/DiaryService");
        String expResult = diary.getMuscleGroup();
        String result = instance.selectMuscleGroup(index);
        assertEquals(expResult, result);
        container.close();
        
    }

    /**
     * Test of selectTask method, of class DiaryService.
     */
    @Test
    public void testSelectTask() throws Exception {
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
        System.out.println("selectTask");
        Integer index = 1;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        DiaryService instance = (DiaryService)container.getContext().lookup("java:global/classes/DiaryService");
        String expResult = diary.getTasks();
        String result = instance.selectTask(index);
        assertEquals(expResult, result);
        container.close();
        
    }

    /**
     * Test of selectWeight method, of class DiaryService.
     */
    @Test
    public void testSelectWeight() throws Exception {
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
        System.out.println("selectWeight");
        Integer index = 1;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        DiaryService instance = (DiaryService)container.getContext().lookup("java:global/classes/DiaryService");
        String expResult = diary.getWeight();
        Long result = instance.selectWeight(index);
        assertEquals(expResult, result);
        container.close();
        
    }

    /**
     * Test of selectRepeats method, of class DiaryService.
     */
    @Test
    public void testSelectRepeats() throws Exception {
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
        System.out.println("selectRepeats");
        Integer index = 1;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        DiaryService instance = (DiaryService)container.getContext().lookup("java:global/classes/DiaryService");
        Integer expResult = diary.getRepeatAmount();
        Integer result = instance.selectRepeats(index);
        assertEquals(expResult, result);
        container.close();
        
    }

    /**
     * Test of addFilings method, of class DiaryService.
     */
    @Test
    public void testAddFilings() throws Exception {
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
        System.out.println("addFilings");
     
        String filings = diary.getFillings();
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        DiaryService instance = (DiaryService)container.getContext().lookup("java:global/classes/DiaryService");
        instance.addFilings(diary, filings);
        container.close();
        assertNotNull(instance);
    }
}
