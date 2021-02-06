/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.lavanderia.service;

import java.util.List;
import project.lavanderia.entity.Pelanggan;
import project.lavanderia.error.pelangganException;

/**
 *
 * @author Dean
 */
public interface PelangganDao {
    public void insertPelanggan(Pelanggan pelanggan) throws pelangganException;
    
    public List<Pelanggan> selectAllPelanggan() throws pelangganException;
}
