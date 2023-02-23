/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dosyayazma;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class DosyaYazma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("kullanici adi:");
        String ad=input.next();
        System.out.print("Sifre :");
        String sifre=input.next();
        Date tarih =new Date();
        
        if(ad.equals("admin")&& sifre.equals("123456")){
            System.out.println("giris basarili");
            try(FileWriter writer =new FileWriter("dosya1.txt")){
                writer.write(ad +"-"+tarih.toString());
            } catch (IOException ex) {
               System.out.println("dosya oluşturulurken hata");
            }
        }
        else{
            System.out.println("giris basarisiz");
        }
   
    }
    
}
