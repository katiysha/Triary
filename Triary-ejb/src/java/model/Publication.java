/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlTransient;
import model.baseclass.BaseEntity;
import model.baseclass.PublicType;
/**
 *
 * @author aliona
 */
@Entity
@Table(name = "publication", catalog = "triary", schema = "")
//@XmlRootElement
@NamedQueries({
   @NamedQuery(name = "Publication.findAll", query = "SELECT p FROM Publication p"),
    //@NamedQuery(name = "Publication.findByText", query = "SELECT p FROM Publication p WHERE p.text = :text"),
    @NamedQuery(name = "Publication.findByTitle", query = "SELECT p FROM Publication p WHERE p.title = :title")
    //@NamedQuery(name = "Publication.findByDate", query = "SELECT p FROM Publication p WHERE p.date_publ = :date"),
    //@NamedQuery(name = "Publication.getByAutor", query = "SELECT p FROM Publication p WHERE p.autor_id = :autor"),
    //@NamedQuery(name = "Publication.findByType", query = "SELECT p FROM Publication p WHERE p.type = :type ORDER BY p.date_publ DESC")
})
public class Publication extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "text", nullable = true, length = 255)
    private String text;
    @Column(name = "title", nullable = true, length = 255)
    private String title;
    @Column(name = "subtext", nullable = true, length = 255)
    private String subtext;
    @Column(name = "date_publ")
    @Temporal(TemporalType.DATE)
    private Date date_publ;
   // @Size(min = 1, max = 15)
    @Column(name = "type", nullable = true, length = 55)
    private String type;
    @OneToMany(mappedBy = "publication", cascade={CascadeType.ALL})
    private List<Comment> commentList;
    @JoinColumn(name = "autor", referencedColumnName = "id")
    @ManyToOne
    private Users autor;

    public void addComment(Comment comm) {
        if (null != commentList && null != comm) {
            commentList.add(comm);
        } 
    }

    public void delComment(Comment comm) {
        if (null != commentList && null != comm) {
            commentList.remove(comm);
        } 
    }

    public Publication() {
    }

    public Publication(Integer id) {
        this.id = id;
    }

    public Publication(Integer id, String text, String type) {
        this.id = id;
        this.text = text;
        this.type = type;
    }

    public Date getDate_publ() {
        return date_publ;
    }

    public void setDate_publ(Date date_publ) {
        this.date_publ = date_publ;
    }
    
    
     

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date_publ;
    }

    public void setDate(Date date) {
        this.date_publ = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @XmlTransient
    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }

    public Users getAutor() {
        return autor;
    }

    public void setAutor(Users autor) {
        this.autor = autor;
    }
    
    public String getSubtext() {
        return subtext;
    }

    public void setSubtext(String subtext) {
        this.subtext = subtext;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTypeNews() {
        this.type = PublicType.NEWS.toString();         
    }

    public void setTypeDiets() {
        this.type = PublicType.DIETS.toString();         
    }
    
    public void setTypeTrMethod() {
        this.type = PublicType.TRAININGMETHODS.toString();         
    }
    
}
