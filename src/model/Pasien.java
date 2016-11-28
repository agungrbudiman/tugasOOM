/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author agungrb
 */
public class Pasien {
    private String nama;
    private ArrayList<Perawatan> Perawatan = new ArrayList<Perawatan>();

    public Pasien(String nama) {
        this.nama = nama;
    }
    
    public ArrayList<Perawatan> getListPerawatan() {
        return Perawatan;
    }
    
    public void Perawatan(Poli poli, Ruangan ruangan, String tanggal) {
        Perawatan.add(new Perawatan(poli, ruangan, tanggal));
    }

    @Override
    public String toString() {
        return nama;
    }
    
    
}
