/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import model.baseclass.UserBase;

/**
 *
 * @author kate
 */

@Entity
@Table(name = "users", catalog = "triary", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"login"})})
@NamedQueries({
   @NamedQuery(name = "User.findById", query = "SELECT u FROM user u WHERE u.id_user = :id_user")
})
@XmlRootElement
public class Users extends UserBase implements Serializable {
     
    @Column(name = "role_user", nullable = false, length = 15)
    private String roleuser;
    @OneToMany(mappedBy = "autor")
    private List<Comment> commentList;
    @OneToMany(mappedBy = "autor")
    private List<Publication> publicationList;
    @OneToOne(mappedBy = "owner")
    private Diary diary;

    public Users() {
    }

    public Users(Integer id) {
        this.id = id;
    }

    public Users(String login, String name, String password, String surname, String roleuser) {
        // this.id = id;
        this.login = login;
        this.name = name;
        this.password = password;
        this.surname = surname;
        this.roleuser = roleuser;
    }
    
    public void addRecordIntoDiary(Diary diary){
        if (diary != null){
            
        }
    }
    
    public void addPublication(Publication publ) {
        if (null != publicationList && null != publ) {
            publicationList.add(publ);
        }
    }
    
    public boolean delPublication(Publication publ) {
        if (null != publicationList && null != publ) {
            return publicationList.remove(publ);
        } else {
            return false;
        }
    }
    
    public void addComment(Comment comm) {
        if (null != commentList && null != comm) {
            commentList.add(comm);
        }
    }
    
    public boolean delComment(Comment comm) {
        if (null != commentList && null != comm) {
            return commentList.remove(comm);
        } else {
            return false;
        }
    }
    
    @XmlTransient
    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }

    @XmlTransient
    public List<Publication> getPublicationList() {
        return publicationList;
    }

    public void setPublicationList(List<Publication> publicationList) {
        this.publicationList = publicationList;
    }
    
    public String getRoleuser() {
        return roleuser;
    }

    public void setRoleuser(String roleuser) {
        this.roleuser = roleuser;
    }
    
    public Diary getDiary() {
        return diary;
    }

    public void setDiary(Diary diary) {
        this.diary = diary;
    }
}