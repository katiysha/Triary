/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.mbeans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author kate
 */
@ManagedBean(name="galleryMB")
public class GalleryManagedBean {
    private List<String> images;  
  
    @PostConstruct  
    public void init() {  
        images = new ArrayList<String>();  
  
        for(int i=1;i<=12;i++) {  
            images.add("gallery" + i + ".jpg");  
        }  
    }  
  
    public List<String> getImages() {  
        return images;  
    }  
}
