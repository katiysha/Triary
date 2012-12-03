/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.faces.application.FacesMessage;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aliona
 */
public class UserControllerTest {
    
    public UserControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setFacesMessage method, of class UserController.
     */
    @Test
    public void testSetFacesMessage() {
        System.out.println("setFacesMessage");
        FacesMessage messages = null;
        UserController instance = null;
        instance.setFacesMessage(messages);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listById method, of class UserController.
     */
    @Test
    public void testListById() {
        System.out.println("listById");
        UserController instance = null;
        String expResult = "";
        String result = instance.listById();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listByUName method, of class UserController.
     */
    @Test
    public void testListByUName() {
        System.out.println("listByUName");
        UserController instance = null;
        String expResult = "";
        String result = instance.listByUName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUser_name method, of class UserController.
     */
    @Test
    public void testGetUser_name() {
        System.out.println("getUser_name");
        UserController instance = null;
        String expResult = "";
        String result = instance.getUser_name();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUser_name method, of class UserController.
     */
    @Test
    public void testSetUser_name() {
        System.out.println("setUser_name");
        String user_name = "";
        UserController instance = null;
        instance.setUser_name(user_name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUser_Id method, of class UserController.
     */
    @Test
    public void testGetUser_Id() {
        System.out.println("getUser_Id");
        UserController instance = null;
        Integer expResult = null;
        Integer result = instance.getUser_Id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUser_Id method, of class UserController.
     */
    @Test
    public void testSetUser_Id() {
        System.out.println("setUser_Id");
        Integer user_id = null;
        UserController instance = null;
        instance.setUser_Id(user_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
