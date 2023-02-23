/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author DELL
 */
public class Buffered {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try(BufferedWriter writer =new BufferedWriter(new FileWriter("dosya2.txt"))){
            writer.write("beyzos");
        } catch (IOException ex) {
            System.out.println("dosya acilirken hata");
            
          
        }
    }
    
}
