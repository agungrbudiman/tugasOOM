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
public class Aplikasi {
    public ArrayList<Pasien> listPasien = new ArrayList<Pasien>();
    public ArrayList<Dokter> listDokter = new ArrayList<Dokter>();
    public ArrayList<Poli> listPoli = new ArrayList<Poli>();
    public ArrayList<Ruangan> listRuangan = new ArrayList<Ruangan>();
    
    public void inisialisasi() {
        listDokter.add(new Dokter("Agung","Bedah"));
        listDokter.add(new Dokter("Budi","Penyakit Dalam"));
        listDokter.add(new Dokter("Joko","Kandungan"));
        listDokter.add(new Dokter("Rini","Anak"));
        listDokter.add(new Dokter("Reno","Umum"));
        
        listPoli.add(new Poli("Umum"));listPoli.get(0).addDokter(listDokter.get(4));
        listPoli.add(new Poli("Gigi"));listPoli.get(1).addDokter(listDokter.get(0));
        listPoli.add(new Poli("Anak"));listPoli.get(2).addDokter(listDokter.get(3));
        
        listRuangan.add(new Ruangan("Flamboyan","I"));
        listRuangan.add(new Ruangan("Melati","II"));
        listRuangan.add(new Ruangan("Mawar","III"));
        listRuangan.add(new Ruangan("Tulip","I"));
        
        listPasien.add(new Pasien("Dani"));
        listPasien.get(0).Perawatan(listPoli.get(0), listRuangan.get(2), "01-01-2016");
        listPasien.get(0).Perawatan(listPoli.get(1), listRuangan.get(2), "07-07-2016");
        listPasien.get(0).Perawatan(listPoli.get(1), listRuangan.get(2), "12-12-2016");
        
        listPasien.add(new Pasien("Jokowi"));
        listPasien.get(1).Perawatan(listPoli.get(0), listRuangan.get(0), "12-12-2016");
        listPasien.get(1).Perawatan(listPoli.get(1), listRuangan.get(3), "08-09-2016");
        listPasien.get(1).Perawatan(listPoli.get(1), listRuangan.get(0), "07-10-2016");
        
    }
}
