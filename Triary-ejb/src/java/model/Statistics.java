/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author kate
 */
public class Statistics {
    private static final long serialVersionUID = 1L;
    
    @Column(name = "title", nullable = true, length = 255)
    private String title;
    @Column(name = "type", nullable = false, length = 15)
    private String type;
    
    @JoinColumn(name = "owner", referencedColumnName = "id")
    @ManyToOne
    private Users owner;
    
    public Statistics(){}
    
    private HashMap hm = null;
    
    
    public HashMap addWeightStat(){
        List<String> dates = null;
        List<String> weights = null;
        Profile prof = null;
        dates.add(prof.getDate().toString());
        weights.add(prof.getWeight().toString()); 
        
        hm.put(dates, weights);
        return hm;
    }
    
    public HashMap addMuscleStat(){
        List<String> dates = null;
        List<String> dimensions = null;
        Profile prof = null;
        dates.add(prof.getDate().toString());
        dimensions.add(prof.getMuscleDimension().toString()); 
        
        hm.put(dates, dimensions);
        return hm;
    }
    
    public HashMap addExerciseStat(){
        List<String> repeats = null;
        List<String> weights = null;
        Diary diary = null;
        repeats.add(diary.getRepeatAmount().toString());
        weights.add(diary.getWeight().toString()); 
        
        hm.put(repeats, weights);
        return hm;
    }
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    public Users getOwner() {
        return owner;
    }

    public void setOwner(Users owner) {
        this.owner = owner;
    }
}