/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.baseclass;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author kate
 */
public class BaseEntityTest {
    
    public BaseEntityTest() {
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
     * Test of getId method, of class BaseEntity.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        BaseEntity instance = new BaseEntityImpl();
        Long expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class BaseEntity.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        BaseEntity instance = new BaseEntityImpl();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class BaseEntity.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        BaseEntity instance = new BaseEntityImpl();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class BaseEntity.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        BaseEntity instance = new BaseEntityImpl();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class BaseEntity.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        BaseEntity instance = new BaseEntityImpl();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class BaseEntityImpl extends BaseEntity {
    }
}
