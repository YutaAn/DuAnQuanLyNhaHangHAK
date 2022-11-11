/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import entity.DanhMuc;
import java.util.List;
import repository.ICommonRepository;
import repository.impl.DanhMucRepository;
import service.ICommonService;

/**
 *
 * @author admin
 */
public class DanhMucService implements ICommonService<DanhMuc> {

    private ICommonRepository repo;

    public DanhMucService() {
        this.repo = new DanhMucRepository();
    }

    @Override
    public List<DanhMuc> getLists() {
        return repo.getAll();
    }

    @Override
    public List<DanhMuc> search(String key) {
        return repo.searchByKey(key);
    }

    @Override
    public String addOrUpdate(DanhMuc t) {
        if (repo.addOrUpdate(t)) {
            return "Thanh cong";
        }
        return "That bai";
    }

    @Override
    public String delete(DanhMuc t) {
        if (repo.delete(t)) {
            return "Thanh cong";
        }
        return "That bai";
    }

}
