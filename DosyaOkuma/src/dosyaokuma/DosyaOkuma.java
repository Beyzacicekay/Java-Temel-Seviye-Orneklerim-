/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dosyaokuma;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class DosyaOkuma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try(Scanner input =new Scanner(new FileReader("dosya.txt"))){
            while(input.hasNextLine()){// hepsini oku 
             System.out.println(input.nextLine());
            }
            
        } catch (FileNotFoundException ex) {
           System.out.println("dosya bulunamadi");
        }
    }
    
}
