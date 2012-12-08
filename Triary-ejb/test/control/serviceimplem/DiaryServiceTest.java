/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control.serviceimplem;

import controller.DiaryController;
import java.util.List;
import javax.ejb.embeddable.EJBContainer;
import static org.mockito.Mockito.*;
import org.junit.*;
import static org.junit.Assert.*;
import javax.faces.application.FacesMessage;
import model.Diary;
import model.Users;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

/**
 *
 * @author kate
 */
@RunWith(MockitoJUnitRunner.class)
public class DiaryServiceTest {

    /* public List<Publication> publ;
     public List<Comment> comm;
     public List<Users> users;
     public List<Diary> diaries;*/
    private FacesMessage fMessages;
    @Mock
    private Diary diary;
      @Mock
    private Users user;
    @Mock
    private List<String> mockedDiary;
    private String mDiary;
    @Mock
    private DiaryService diaryService;
    private DiaryController controller;

    public DiaryServiceTest() {
    }

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        diaryService = mock(DiaryService.class);
        fMessages = mock(FacesMessage.class);
        controller = new DiaryController(diaryService);
        //controller.DiaryController(diary);
        controller.setFacesMessage(fMessages);
    }

    /**
     *
     */
    @Test
    public void testMuscleGroup() {
        when(diary.getMuscleGroup()).thenReturn(mDiary);
        List<String> result = diaryService.getMuscleGroup();
        assertNotNull(result);
    }

    @Test
    public void testDiary() {
     user.setEmail("111111");
     user.setId(1);
     user.setLogin("login");
     user.setName("mane");
     user.setPassword("password");
     user.setPhone("111-222-333");
     user.setSurName("surname");
     diaryService.addRecord(user, "training type", "muscle_group", "task", "tr_duration", 10, "filling");
     mockedDiary = diaryService.getTask();
     assertNotNull(mockedDiary);
     }
@Test 
public void testAddFillings(){
    diary.setId(0);
    diaryService.addFilings(diary, "ok");
    String result = diaryService.selectFealings(diary.getId());
    assertNull(result);
    }
   

     @Test
     public void testIncorrectData() {
     controller.setId_task(2);
     String result = controller.listSelectTask();  
     assertNull(result);
        
     }
     @Test
     public void testMuscles() {
     controller.setId_muscle(0);        
     String result = controller.selectMuscleById();
      assertEquals("empty", result);
     }
     
    
}
