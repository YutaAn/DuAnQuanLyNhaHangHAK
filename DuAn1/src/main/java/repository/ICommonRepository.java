/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;

import java.util.List;


/**
 *
 * @author admin
 */
public interface ICommonRepository <T>{

    List<T> getAll();

    boolean addOrUpdate(T t);

    boolean delete(T t);
    
    List<T> searchByKey(String key);
    
}
