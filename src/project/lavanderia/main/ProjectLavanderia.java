/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.lavanderia.main;

import java.sql.SQLException;
import project.lavanderia.database.LavanderiaDatabase;
import project.lavanderia.entity.Pelanggan;
import project.lavanderia.error.pelangganException;
import project.lavanderia.service.PelangganDao;

/**
 *
 * @author Dean
 */
public class ProjectLavanderia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, pelangganException {
        PelangganDao dao = LavanderiaDatabase.getPelangganDao();
        Pelanggan pelanggan = new Pelanggan();
        pelanggan.setNama("Dean Ghifari");
        pelanggan.setAlamat("Buah Batu");
        pelanggan.setTelp("088801845870");
        pelanggan.setJenis("Cuci Setrika");
        pelanggan.setBerat(3.5);
        pelanggan.setHarga(pelanggan.getHarga());
        
        dao.insertPelanggan(pelanggan);
    }
    
}
