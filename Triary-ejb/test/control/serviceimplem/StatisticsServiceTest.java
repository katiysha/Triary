/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control.serviceimplem;

import javax.faces.bean.RequestScoped;
import controller.StatisticsController;
import java.util.Calendar;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.persistence.EntityManager;
import static org.mockito.Mockito.*;
import model.*;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author kate
 */
public class StatisticsServiceTest {
    
        private StatisticsController controller;
    private StatisticsService statisticsService;
    private FacesMessage fMessages;
    private Statistics stat;
    public StatisticsServiceTest() {
    }

   
    @Before
    public void setUp() {
        statisticsService = mock(StatisticsService.class);
        fMessages = mock(FacesMessage.class);
        
        controller = new StatisticsController(statisticsService);
        controller.setFacesMessage(fMessages);
    }
    
    @After
    public void tearDown() {
        controller = null;
    }

    
    /**
     * Test of getByWeight method, of class StatisticsService.
     */
     @Test
    public void testIncorrectWeight() {
         stat=new Statistics();
         stat.setTitle("title");
         stat.setType(2);
        // statisticsService.
       assertNotNull(statisticsService.getByExercise("exersise")     );
      
    }
}
