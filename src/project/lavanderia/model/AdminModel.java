/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.lavanderia.model;

import java.sql.SQLException;
import project.lavanderia.database.LavanderiaDatabase;
import project.lavanderia.entity.Admin;
import project.lavanderia.error.pelangganException;
import project.lavanderia.listener.AdminListener;
import project.lavanderia.service.AdminDao;

/**
 *
 * @author ryzen
 */
public class AdminModel {
    private String username;
    private String password;

    
    private AdminListener listener;

    public AdminListener getListener() {
        return listener;
    }

    public void setListener(AdminListener listener) {
        this.listener = listener;
    }
    
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
        fireOnChange();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        fireOnChange();
    }
    
    protected void fireOnChange(){
        if (listener!=null) {
            listener.onChange(this);      
        }
    }
    
    
    protected void fireOnInsert(Admin admin){
        if (listener!=null) {
            listener.onInsert(admin); 
    }
}
    
    public void insertAdmin() throws SQLException, pelangganException{
        
        AdminDao dao = LavanderiaDatabase.getAdminDao();
        Admin admin = new Admin();
        admin.setUsername(username);
        admin.setPassword(password);
        
        dao.insertAdmin(admin);
        fireOnInsert(admin);
    }
    
    public void resetAdmin(){
         setUsername("");
         setPassword("");
     }

    
}
