/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.*;
import view.*;

/**
 *
 * @author agungrb
 */
public class Controller implements ActionListener{
    private Aplikasi app;
    private View view;
    
    public Controller(Aplikasi app) {
        this.app = app;
        gotoHalamanUtama();
    }
    
    private void gotoHalamanUtama() {
        HalamanUtama x = new HalamanUtama();
        x.setVisible(true);
        x.addListener(this);
        view = x;
    }
    private void gotoRegistrasi() {
        Registrasi x = new Registrasi();
        for (Ruangan r : app.listRuangan)  {
            x.setRuangan(r);
        }
        for (Poli p : app.listPoli) {
            x.setPoli(p);
        }
        for (Pasien p : app.listPasien) {
            x.setPasien2(p);
        }
        x.setVisible(true);
        x.addListener(this);
        view = x;
    }
    private void gotoMedRecord() {
        MedRecord x = new MedRecord();
        for (Pasien p : app.listPasien) {
            x.setPasien(p);
        }
        x.setVisible(true);
        x.addListener(this);
        view = x;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object s = e.getSource();
        
        if(view instanceof HalamanUtama) {
            HalamanUtama x = (HalamanUtama) view;
            if(s.equals(x.getBtnRegistrasi())) {
                x.dispose();
                gotoRegistrasi();
            }
            else if(s.equals(x.getBtnMedRecord())) {
                x.dispose();
                gotoMedRecord();
            }
        }
        
        else if(view instanceof Registrasi) {
            Registrasi x = (Registrasi) view;
            if(s.equals(x.getBtnKembali())) {
                x.dispose();
                gotoHalamanUtama();
            }
            else if(s.equals(x.getBtnDaftar())) {
                String nama = x.getNama();
                String tanggal = x.getTanggal(1);
                Poli p = (Poli) x.getPoli(1);
                Ruangan r = (Ruangan) x.getRuangan(1);
                app.listPasien.add(new Pasien(nama));
                app.listPasien.get(app.listPasien.size()-1).Perawatan(p, r, tanggal);
                JOptionPane.showMessageDialog(x.getRootPane(), "Registrasi Berhasil", "Sukses", 1);
            }
            else if(s.equals(x.getBtnDaftar2())) {
                Pasien p = (Pasien) x.getPasien2();
                String tanggal = x.getTanggal(2);
                Poli po = (Poli) x.getPoli(2);
                Ruangan r = (Ruangan) x.getRuangan(2);
                p.Perawatan(po, r, tanggal);
                JOptionPane.showMessageDialog(x.getRootPane(), "Registrasi Berhasil", "Sukses", 1);
            }
        }
        
        else if(view instanceof MedRecord) {
            MedRecord x = (MedRecord) view;
            if(s.equals(x.getBtnKembali())) {
                x.dispose();
                gotoHalamanUtama();
            }
            else if(s.equals(x.getBtnRefresh())) {
                Pasien p = (Pasien) x.getPasien();
                int i=0;
                for (Perawatan o : app.listPasien.get(app.listPasien.indexOf(p)).getListPerawatan()) {
                    x.showRiwayat(o.getTanggal(), o.getPoli().toString(), 
                            o.getRuangan().toString(), o.getPoli().getDokter(0).toString(),i);
                    i++;
                }
            }
        }
    }
}
