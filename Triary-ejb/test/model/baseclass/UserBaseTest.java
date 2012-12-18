/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.baseclass;

import java.security.Timestamp;
import java.util.Date;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author kate
 */
public class UserBaseTest {
    
    public UserBaseTest() {
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
     * Test of getEmail method, of class UserBase.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        UserBase instance = new UserBase();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class UserBase.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        UserBase instance = new UserBase();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCreationDate method, of class UserBase.
     */
    @Test
    public void testGetCreationDate() {
        System.out.println("getCreationDate");
        UserBase instance = new UserBase();
        Timestamp expResult = null;
        Date result = instance.getCreationDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCreationDate method, of class UserBase.
     */
    @Test
    public void testSetCreationDate() {
        System.out.println("setCreationDate");
        Date cd = null;
        UserBase instance = new UserBase();
        instance.setCreationDate(cd);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class UserBase.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        UserBase instance = new UserBase();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class UserBase.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        UserBase instance = new UserBase();
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLogin method, of class UserBase.
     */
    @Test
    public void testGetLogin() {
        System.out.println("getLogin");
        UserBase instance = new UserBase();
        String expResult = "";
        String result = instance.getLogin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLogin method, of class UserBase.
     */
    @Test
    public void testSetLogin() {
        System.out.println("setLogin");
        String login = "";
        UserBase instance = new UserBase();
        instance.setLogin(login);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class UserBase.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        UserBase instance = new UserBase();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class UserBase.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        UserBase instance = new UserBase();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSurName method, of class UserBase.
     */
    @Test
    public void testGetSurName() {
        System.out.println("getSurName");
        UserBase instance = new UserBase();
        String expResult = "";
        String result = instance.getSurName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSurName method, of class UserBase.
     */
    @Test
    public void testSetSurName() {
        System.out.println("setSurName");
        String surname = "";
        UserBase instance = new UserBase();
        instance.setSurName(surname);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPhone method, of class UserBase.
     */
    @Test
    public void testGetPhone() {
        System.out.println("getPhone");
        UserBase instance = new UserBase();
        String expResult = "";
        String result = instance.getPhone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPhone method, of class UserBase.
     */
    @Test
    public void testSetPhone() {
        System.out.println("setPhone");
        String phone = "";
        UserBase instance = new UserBase();
        instance.setPhone(phone);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class UserBase.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        UserBase instance = new UserBase();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class UserBase.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        UserBase instance = new UserBase();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class UserBase.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        UserBase instance = new UserBase();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
