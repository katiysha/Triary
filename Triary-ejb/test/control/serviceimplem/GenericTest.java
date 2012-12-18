/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control.serviceimplem;

import java.util.List;
import javax.persistence.EntityManager;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author kate
 */
public class GenericTest {
    
    public GenericTest() {
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
     * Test of getEntityManager method, of class Generic.
     */
    @Test
    public void testGetEntityManager() {
        System.out.println("getEntityManager");
        Generic instance = null;
        EntityManager expResult = null;
        EntityManager result = instance.getEntityManager();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class Generic.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        Long id = null;
        Generic instance = null;
        Object expResult = null;
        Object result = instance.find(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class Generic.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Object entity = null;
        Generic instance = null;
        instance.create(entity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of edit method, of class Generic.
     */
    @Test
    public void testEdit() {
        System.out.println("edit");
        Object entity = null;
        Generic instance = null;
        instance.edit(entity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class Generic.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Object entity = null;
        Generic instance = null;
        instance.remove(entity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of count method, of class Generic.
     */
    @Test
    public void testCount() {
        System.out.println("count");
        Generic instance = null;
        int expResult = 0;
        int result = instance.count();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class Generic.
     */
    @Test
    public void testFindAll() {
        System.out.println("findAll");
        Generic instance = null;
        List expResult = null;
        List result = instance.findAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findRange method, of class Generic.
     */
    @Test
    public void testFindRange() {
        System.out.println("findRange");
        int[] range = null;
        Generic instance = null;
        List expResult = null;
        List result = instance.findRange(range);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class GenericImpl extends Generic {

        public GenericImpl() {
            super(null);
        }

        public EntityManager getEntityManager() {
            return null;
        }
    }
}
