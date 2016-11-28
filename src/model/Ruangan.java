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
public class Ruangan {
    private String nama;
    private String kelas;
    
    public Ruangan(String nama, String kelas) {
        this.nama = nama;
        this.kelas = kelas;
    }

    @Override
    public String toString() {
        return nama;
    }

    
    
}
