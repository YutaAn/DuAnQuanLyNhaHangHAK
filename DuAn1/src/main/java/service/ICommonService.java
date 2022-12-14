/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;

/**
 *
 * @author admin
 */
public interface ICommonService<T> {

    List<T> getLists();

    List<T> search(String key);

    String addOrUpdate(T t);
    
    String delete(T t);
    
}
