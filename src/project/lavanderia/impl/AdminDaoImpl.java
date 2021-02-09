/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.lavanderia.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import project.lavanderia.entity.Admin;
import project.lavanderia.error.pelangganException;
import project.lavanderia.service.AdminDao;

/**
 *
 * @author ryzen
 */
public class AdminDaoImpl implements AdminDao{
    private Connection connection;
    private final String insertAdmin = "INSERT INTO ADMIN"
            + " (USERNAME, PASSWORD) VALUES"
            + " (?,?)";


    public AdminDaoImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void insertAdmin(Admin admin) throws pelangganException {
        PreparedStatement statement = null;
        
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(insertAdmin, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, admin.getUsername());
            statement.setString(2, admin.getUsername());
            statement.executeUpdate();
            
        } catch (SQLException e) {
           try {
               connection.rollback();
           } catch (SQLException ex){
           }
           throw new pelangganException(e.getMessage());
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex){
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e){
            }
        }
    }
}
    @Override
    public List<Admin> selectAllAdmin() throws pelangganException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
