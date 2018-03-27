/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan01;

/**
 *
 * @author Om Genocide
 */
public class KameraAksi {
    public static void main(String[] args) {
        Kamera Canon = new Kamera();
        Kamera Sony = new Kamera();
        Kamera Nikon = new Kamera();
        
        System.out.println("Kamera Canon");
        Canon.Merek="M10";
        Canon.Megapixel="21";
        Canon.Harga="5 Jutaan";
            Canon.infoKamera();
            
        System.out.println("Kamera Sony");
        Sony.Merek="A6000";
        Sony.Megapixel="27";
        Sony.Harga="7 Jutaan";
            Sony.infoKamera();
            
        System.out.println("Kamera Nikon");
        Nikon.Merek="D7000";
        Nikon.Megapixel="18";
        Nikon.Harga="4.5 Jutaan";
            Nikon.infoKamera();
    }
}
