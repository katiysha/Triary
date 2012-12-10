/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.List;
/**
 *
 * @author kate
 */
public interface IGeneric<T> {
    
    void create(T entity);
    
    void edit(T entity);
    
    void remove(T entity);
    
    int count();
    
    T find(Integer id);
    
    List<T> findAll();
    
    List<T> findRange(int[] range);
}
