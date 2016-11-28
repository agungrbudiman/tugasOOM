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
public class Poli {
    private ArrayList<Dokter> listDokter = new ArrayList<Dokter>();
    private String nama;

    public Poli(String nama) {
        this.nama = nama;
    }
    
    public void addDokter(Dokter d) {
        listDokter.add(d);
    }
    
    public Dokter getDokter(int idx) {
        return listDokter.get(idx);
    } 

    @Override
    public String toString() {
        return nama;
    }
    
    
}
