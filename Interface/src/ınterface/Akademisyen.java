/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ınterface;

/**
 *
 * @author DELL
 */
public class Akademisyen implements ICalisan {
    public String ad,bolum,gorev;
    public Akademisyen(String ad,String bolum ,String gorev){
        this.ad=ad;
        this.bolum=bolum ;
        this.gorev=gorev ;
        
    }

    Akademisyen() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void giris() {
        System.out.println("giris yapildi");
    }

    @Override
    public void cikis() {
         System.out.println("cikis yapildi");
        
    }

    @Override
    public boolean yemen(int saat) {
        System.out.println("yemek yendi ");
        return false;
       
    }
    
    
}
