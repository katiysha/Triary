/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control.serviceimplem;

import controller.ProfileController;
import java.util.Calendar;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.persistence.EntityManager;
import model.*;
import org.junit.*;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

/**
 *
 * @author kate
 */
@RunWith(MockitoJUnitRunner.class)
public class ProfileServiceTest {
  //  private Users usr;
     @Mock
    private Profile profile;
      @Mock
    private Users user;
    @Mock
    private List<String> mockedProfile;
    @Mock
    private String mProfile;
    @Mock
    private DiaryService diaryService;
    private ProfileController controller;
    private ProfileService profileService;
    private FacesMessage fMessages;
    
    public ProfileServiceTest() {
    }    
    @Before
    public void setUp() {
//     MockitoAnnotations.initMocks(this);
        //создание мок-обьекта из класса ProfileService
        profileService = mock(ProfileService.class);
        fMessages = mock(FacesMessage.class);
        controller = new ProfileController(profileService);
        controller.setFacesMessage(fMessages);
    }
    
    @After
    public void tearDown() {
    controller = null;
    }

    
    /**
     * Test of getByUser method, of class ProfileService.
     */
  /* @Test
    public void testAddOwnMethod() {
              // profile = new Profile();
       
       profile.setDiet("diet");
       profile.setMuscleDimension(10);
       profile.setRation("ration");
       profile.setWeight("90");
       profileService.addOwnMethod("method", profile);
     assertNotNull(profile.getRation());
    }*/
   @Test
   public void test(){
       controller.setProfile_owner(0);
      user.setId(0);
     when(profileService.getByUser(user)).thenReturn(null);
       /* profile.setDiet("diet");
       profile.setMuscleDimension(10);
       profile.setRation("ration");
       profile.setWeight("90");
       profileService.addDiet("diet", profile);*/
      // String result = profile.getDiet();
     String   result = controller.listByUsr(user);
       assertNull(result);
        
   }
  
   
   @Test
   public void testEnStat(){
   profile = new Profile();
   profileService.enabledStatistic(true);
   assertTrue(profile.isDiaryEnabled());
   
   }
   
   @Test
   public void testDiaryEn(){
       profile = new Profile();
       profileService.enabledDiary(false);
       assertFalse(profile.isDiaryEnabled());
   }
           

    
}
