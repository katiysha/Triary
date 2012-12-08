/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control.serviceimplem;


import controller.PublicationController;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.persistence.EntityManager;
import model.Comment;
import model.Publication;
import model.Users;
import static org.mockito.Mockito.*;
import model.baseclass.PublicType;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author kate
 */
public class PublicationServiceTest {
    private Publication publication;
    private PublicationService publicationService;
   private Users user;
     private PublicationController controller;
   
    private FacesMessage fMessages;
    private String res;
    public PublicationServiceTest() {
    }

       
    @Before
    public void setUp() {
      publicationService = mock(PublicationService.class);
        fMessages = mock(FacesMessage.class);
       controller = new PublicationController(publicationService); 
        controller.setFacesMessage(fMessages);
    }
    
    @After
    public void tearDown() {
        controller = null;
    }
    
    
    @Test
    public void testIncorrectType() {
       controller.setPubl_Type("1");
       when(publicationService.getByType("0")).thenReturn(null);
        String result = controller.listByType();
        assertEquals("succed", result);
        
    }
    @Test
    public void testindByDate() {
    List <Publication> result= publicationService.findByDate("11-12-2012");
       //controller.setPubl_Type("1");
     //  when(publicationService.getByType("0")).thenReturn(null);
       // String result = controller.listByType();
        //assertEquals("succed", result);
        assertNotNull(result);
    }
    
    @Test
    public void testFindByText(){ 
        publication=new Publication();
        publication.setText("any_text");
     //publicationService.
      assertNotNull(publicationService.findByText("any_text"));
    }
    @Test
    public void testGetAll(){
        publication = new Publication();
        user=new Users();
        user.setEmail("email");
        user.setId(1);
        user.setLogin("login");
        user.setName("name");
        user.setPassword("password");
        user.setPhone("11-22-33");
        publication.setAutor(user);
        publication.setSubtext("sub text");
        publication.setTitle("Title");
        publication.setType("type");
        List<Publication> result =publicationService.getAll();
   assertNotNull(result);
  assertNotNull( publicationService.getByTitle("Title"));
   assertNotNull(publicationService.getByType("type"));
  
    

    }
}

