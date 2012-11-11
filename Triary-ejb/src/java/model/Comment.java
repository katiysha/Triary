/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.security.Timestamp;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import model.baseclass.BaseEntity;

/**
 *
 * @author kate
 */
@Entity
@Table(name = "comment", catalog = "triary", schema = "")
@NamedQueries({
   @NamedQuery(name = "Comment.findAll", query = "SELECT c FROM Comment c"),
   @NamedQuery(name = "Comment.findByPubl", query = "SELECT c FROM Comment c WHERE c.publication = :publication"),
   @NamedQuery(name = "Comment.findByDiary", query = "SELECT c FROM Comment c WHERE c.diary = :diary")
})
@XmlRootElement
public class Comment extends BaseEntity implements Serializable {
    @Column(name = "text", nullable = false, length = 200)
    private String text;
    @Column(name = "date")
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp date;
    @ManyToOne
    @JoinColumn(name = "publication", referencedColumnName = "id")
    private Publication publication;
    @ManyToOne
    @JoinColumn(name = "diary", referencedColumnName = "id")
    private Diary diary;
    @ManyToOne
    @JoinColumn(name = "autor", referencedColumnName = "id")
    private Users autor;
    
    public Comment(){
    }
    
    
    public Comment(String text, Publication publ, Users autor){
            this.text = text;
            this.publication = publ;
            this.autor = autor;
    }
    
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Timestamp getDatecomm() {
        return date;
    }

    public void setDatecomm(Timestamp date) {
        this.date = date;
    }
    
    public Publication getPublication() {
        return publication;
    }

    public void setPublication(Publication publication) {
        this.publication = publication;
    }

    public Diary getDiary() {
        return diary;
    }

    public void setDiary(Diary diary) {
        this.diary = diary;
    }

    
    public Users getAutor() {
        return autor;
    }

    public void setAutor(Users autor) {
        this.autor = autor;
    }
    
}