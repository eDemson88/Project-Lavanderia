/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.lavanderia.service;

import java.util.List;
import project.lavanderia.entity.Admin;
import project.lavanderia.error.pelangganException;

/**
 *
 * @author ryzen
 */
public interface AdminDao {
    
    public void insertAdmin(Admin admin) throws pelangganException;
    
    public List<Admin> selectAllAdmin() throws pelangganException;
    
}
