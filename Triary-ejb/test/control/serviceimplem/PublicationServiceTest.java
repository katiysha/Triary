/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control.serviceimplem;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import model.Comment;
import model.Publication;
import model.Users;
import model.baseclass.PublicType;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author kate
 */
public class PublicationServiceTest {
    
    private PublicationService publicationService;
    public Publication publication;
    
    public List<Publication> publ;
    public List<Comment> comm;
    public List<Users> users;
    
    public PublicationServiceTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
        publication = new Publication();
        publicationService = new PublicationService();
        publ = null;
    }
    
    @After
    public void tearDown() {
        publicationService = null;
    }

     @Test
    public void testCreationObject() throws Exception {
        
        
        assertNotNull(publication);
        
        publication.setText("Text1");
        publication.setTitle("Text");
        publication.setTypeNews();
        publicationService.create(publication);
        
        publ = (List<Publication>) publicationService.getByTitle("Text");
        
        for (Publication publ_element : publ){
        assertEquals(publ_element.getText(), "Text1");
        }
    }
   
}
