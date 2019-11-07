/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118029.latihan55.handphone;

/**
 *
 * @author acer
 * Nama  : Azis komara
 * Nim   : 10118029
 * Kelas : IF-1 
 * Deskripsi program : Program ini menampilkan HandPhone
 */
public class windowsphone extends handphone {
    private String wpkeystore;

    public windowsphone(String manufacture, String operatingsystem, String model, int harga) {
        super(manufacture, operatingsystem, model, harga);
    }

    public String getWpkeystore() {
        return wpkeystore;
    }

    public void setWpkeystore(String wpkeystore) {
        this.wpkeystore = wpkeystore;
    }
    
    
}
