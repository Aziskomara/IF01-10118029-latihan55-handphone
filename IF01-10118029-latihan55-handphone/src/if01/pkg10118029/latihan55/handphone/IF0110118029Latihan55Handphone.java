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
public class IF0110118029Latihan55Handphone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       android android = new android("Samsung", "Android", "Grand", 3000000);
       android.setKeystore("234ibfd3840fo");
       android.displayProduct();
       System.out.println("Android Key Store : " + android.getKeystore());
       
       System.out.println();
        
      blackberry blackberry = new blackberry("BlackB", "RIM", "Curve", 2000000);
      blackberry.setPinBB("BHS249");
      blackberry.displayProduct();
      System.out.println("PIN : " + blackberry.getPinBB());
      
      System.out.println();
        
      windowsphone windowsPhone = new windowsphone("Nokia", "Win 8", "Lumia", 1000000);
      windowsPhone.setWpkeystore("UUUQIJWORJ");
      windowsPhone.displayProduct();
      System.out.println("Wp Key Store : " + windowsPhone.getWpkeystore());
    }
    
}
