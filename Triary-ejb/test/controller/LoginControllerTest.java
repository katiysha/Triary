/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import control.serviceimplem.UserService;
import javax.faces.application.FacesMessage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 *
 * @author kate
 */
public class LoginControllerTest {
    
    private LoginController controller;
    private UserService userService;
    //private FacesMessage fMessages;
    
    public LoginControllerTest() {
    }
    
    @Before
    public void setUp() {
        userService = mock(UserService.class);
        //fMessages = mock(FacesMessage.class);
        
        controller = new LoginController(userService);
        //controller.setFacesMessage(fMessages);
    }
    
    @After
    public void tearDown() {
        controller = null;
    }

    /**
     * Test of setFacesMessage method, of class LoginController.
     */
    @Test
    public void testIncorrectData() {
        controller.setUsername("ann");
        controller.setPassword("pass");
        
        when(userService.login("ann", "pass")).thenReturn(false);
        
        String result = controller.loginClicked();
        
        assertEquals("failed", result);
        
    }


}
