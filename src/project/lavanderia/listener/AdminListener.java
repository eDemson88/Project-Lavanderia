/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.lavanderia.listener;

import project.lavanderia.entity.Admin;
import project.lavanderia.model.AdminModel;

/**
 *
 * @author ryzen
 */
public interface AdminListener {
    
    public void onChange(AdminModel model);
    
    public void onInsert(Admin admin);
}
