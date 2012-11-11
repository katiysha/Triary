/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import model.baseclass.BaseEntity;
/**
 *
 * @author aliona
 */
@Table(name = "diary", catalog = "profile", schema = "")
@NamedQueries({
   @NamedQuery(name = "Profile.findById", query = "SELECT p FROM Profile p WHERE id = :id"),
   @NamedQuery(name = "Profile.getByUser", query = "SELECT p FROM Profile p WHERE owner = :owner")
   
})
@Entity
@XmlRootElement
public class Profile extends BaseEntity implements Serializable{
    
    @Column(name = "diet", nullable=false)
    private String diet;
    @Column(name = "ration", nullable=false)
    private String ration;
    @Column(name = "date", nullable=false)
    private Timestamp date;
    @Column(name = "weight", nullable=false)
    private Long weight;
    @Column(name = "stat_enabled", nullable=false)
    private Boolean stat_enabled;
    @Column(name = "diary_enabled", nullable=false)
    private Boolean diary_enabled;
    @Column(name = "muscle_dimension", nullable=false)
    private Integer muscle_dimension;
    @OneToOne
    @JoinColumn(name = "owner", referencedColumnName = "id")
    private Users owner;
    
    /**
     *
     */
    
    public Profile(){}
    
    public Profile(String diet, String ration, Long weight, Boolean stat_en, Boolean diary_en, Timestamp date){
        this.diet= diet;
        this.ration = ration;
        this.weight = weight;
        this.stat_enabled = stat_en;
        this.diary_enabled= diary_en;
        this.date = date;
    }
    
    
    
    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }
    
    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }
    
    public String getRation() {
        return ration;
    }

    public void setRation(String ration) {
        this.ration = ration;
    }
    
    
    public Integer getMuscleDimension() {
        return muscle_dimension;
    }

    public void setMuscleDimension(Integer muscle_dimension) {
        this.muscle_dimension = muscle_dimension;
    }
    
    public Long getWeight() {
        return weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }
    public Boolean isStatEnabled() {
        return stat_enabled;
    }

    public Boolean isDiaryEnabled() {
        return diary_enabled;
    }
    
}