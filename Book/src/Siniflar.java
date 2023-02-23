/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class Siniflar {
    private  int sayfaSayisi;
    private  String  yazar;
     
   Siniflar(int sayfaSayisi,String yazar){
       
       this.sayfaSayisi=sayfaSayisi;
       this.yazar=yazar;
          
   }
   public int setSayfaSayisi(){
           
          return this.sayfaSayisi=sayfaSayisi;
           
       }
       public void setSayfaSayisi(int size){
          this.sayfaSayisi=size;
       }
       public void getYazar(){
           return this.getYazar();
       }
        public void setYazar(int isim){
          this.yazar=isim;
       }
}
