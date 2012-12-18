/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control.serviceimplem;

import controller.UserController;
import javax.faces.application.FacesMessage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

/**
 *
 * @author kate
 */
public class UserServiceTest {
    
    private UserController controller;
    private UserService userService;
    //private FacesMessage fMessages;
    
    public UserServiceTest() {  
        
    }
    
    @Before
    public void setUp() {
        userService = mock(UserService.class);
        //fMessages = mock(FacesMessage.class);
        
        controller = new UserController(userService);
        //controller.setFacesMessage(fMessages);
    }
    
    @After
    public void tearDown() {
        controller = null;
    }

    @Test
    public void testIncorrectData() {
        controller.setUser_Id(1);
        controller.setUser_name("pupkin");
        
        when(userService.getByUser(0)).thenReturn(null);
        
        String result = controller.listById();
        
        assertEquals("succed", result);
        
    }

}
