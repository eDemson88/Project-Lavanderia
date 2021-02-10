/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.lavanderia.controller;

import javax.swing.JOptionPane;
import project.lavanderia.model.AdminModel;
import project.lavanderia.view.RegisterFrame;

/**
 *
 * @author ryzen
 */
public class AdminController {
    private AdminModel model;

    public void setModel(AdminModel model) {
        this.model = model;
    }
     public void insertAdmin(RegisterFrame view){
        
        String username = view.getUsernameReg().getText();
        String password = view.getPasswordReg().getText();
        
        
            model.setUsername(username);
            model.setPassword(password);
            
            try{
                model.insertAdmin();
                JOptionPane.showMessageDialog(view, "Admin berhasil ditambahkan");
                model.resetAdmin();
            } catch (Throwable e){
               JOptionPane.showMessageDialog(view, new Object[]{"Terjadi error di database dengan pesan ", e.getMessage()});  
            }
     }
     
     
}
