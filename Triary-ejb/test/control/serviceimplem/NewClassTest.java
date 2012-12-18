/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control.serviceimplem;

import java.util.List;
import javax.ejb.embeddable.EJBContainer;
import model.Users;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kate
 */
public class NewClassTest {
    
    public NewClassTest() {
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
     * Test of find method, of class NewClass.
     */
    @Test
    public void testFind() throws Exception {
        System.out.println("find");
        Long id = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        NewClass instance = (NewClass)container.getContext().lookup("java:global/classes/NewClass");
        Users expResult = null;
        Users result = instance.find(id);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class NewClass.
     */
   
}
