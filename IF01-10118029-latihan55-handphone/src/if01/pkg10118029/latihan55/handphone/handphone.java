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
public class handphone {
    protected String manufacture;
    protected String operatingsystem;
    protected String model;
    protected int harga;

    public handphone(String manufacture, String operatingsystem, String model, int harga) {
        this.manufacture = manufacture;
        this.operatingsystem = operatingsystem;
        this.model = model;
        this.harga = harga;
    }
    
    public void displayProduct(){
        System.out.println("Manufaktur " + manufacture);
        System.out.println("OS : " + operatingsystem);
        System.out.println("Model : " + model);
        System.out.println("Harga : " + harga);
    }
}
