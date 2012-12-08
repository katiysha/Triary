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
<<<<<<< HEAD
=======
@Table(name = "diary", catalog = "profile", schema = "")
@NamedQueries({
   @NamedQuery(name = "Profile.findById", query = "SELECT p FROM Profile p WHERE id = :id"),
   @NamedQuery(name = "Profile.getByUser", query = "SELECT p FROM Profile p WHERE owner = :owner"),
   @NamedQuery(name ="Profile.getByDiaryEnabled", query = "SELECT p.diary_enabled FROM Profile p WHERE p.owner_id = :id_users"),
   @NamedQuery(name ="Profile.getByStatisticsEn", query = "SELECT p.stat_enabled FROM Profile p WHERE p.owner_id = :id_users"),
   @NamedQuery(name = "Profile.updateDiaryEnabled", query = "UPDATE Profile p SET p.diary_enabled = :diary_enabled WHERE p.owner_id = :id_users"),
   @NamedQuery(name = "Profile.updateStatisticsEn", query = "UPDATE Profile p SET p.stat_enabled = :stat_enabled WHERE p.owner_id = :id_users"),
})
>>>>>>> 13fc261df3b4eff10e3f2df1d8817ca0a9b1ec13
@Entity
@XmlRootElement
@Table(name = "profile", catalog = "triary", schema = "")
@NamedQueries({
   //@NamedQuery(name = "Profile.findById", query = "SELECT p FROM Profile p WHERE id_profile = :id"),
   //@NamedQuery(name = "Profile.getByUser", query = "SELECT p FROM Profile p WHERE owner_id = :owner"),
   //@NamedQuery(name ="Profile.getByDiaryEnabled", query = "SELECT p.diary_enabled FROM Profile p WHERE p.owner_id = :id_users"),
   //@NamedQuery(name ="Profile.getByStatisticsEn", query = "SELECT p.stat_enabled FROM Profile p WHERE p.owner_id = :id_users"),
   //@NamedQuery(name = "Profile.updateDiaryEnabled", query = "UPDATE Profile p SET p.diary_enabled = :diary_enabled WHERE p.owner_id = :id_users"),
   //@NamedQuery(name = "Profile.updateStatisticsEn", query = "UPDATE Profile p SET p.stat_enabled = :stat_enabled WHERE p.owner_id = :id_users"),
})

public class Profile extends BaseEntity implements Serializable{
    
    @Column(name = "diet", nullable=true, length = 255)
    private String diet;
    @Column(name = "ration", nullable=true, length = 255)
    private String ration;
    @Column(name = "date", nullable=true)
    private Timestamp date;
    @Column(name = "weight", nullable=true, length = 255)
    private String weight;
    @Column(name = "stat_enabled", nullable=true)
    private Boolean stat_enabled;
    @Column(name = "diary_enabled", nullable=true)
    private Boolean diary_enabled;
    @Column(name = "muscle_dimension", nullable=true, length = 15)
    private Integer muscle_dimension;
    @ManyToOne
    @JoinColumn(name = "owner", referencedColumnName = "id")
    private Users owner;
    
    /**
     *
     */
    
    public Profile(){}
    
    public Profile(String diet, String ration, String weight, Boolean stat_en, Boolean diary_en, Timestamp date){
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
    
    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
    public Boolean isStatEnabled() {
        return stat_enabled;
    }

    public Boolean isDiaryEnabled() {
        return diary_enabled;
    }
    
}
