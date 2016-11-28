/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.Aplikasi;

/**
 *
 * @author agungrb
 */
public class TugasImpal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aplikasi app = new Aplikasi();
        app.inisialisasi();
        Controller ctrl = new Controller(app);
    }
    
}
