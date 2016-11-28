/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author agungrb
 */
public class Perawatan {
    private Poli poli;
    private Ruangan ruangan;
    private String tanggal;

    public Perawatan(Poli poli, Ruangan ruangan, String tanggal) {
        this.poli = poli;
        this.ruangan = ruangan;
        this.tanggal = tanggal;
    }

    public Poli getPoli() {
        return poli;
    }

    public Ruangan getRuangan() {
        return ruangan;
    }

    public String getTanggal() {
        return tanggal;
    }
    
    

}
