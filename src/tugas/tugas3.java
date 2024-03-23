/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;
/** 3. Buatlah code java dengan output sebagai berikut
        diketahui, Ada dua pekerja dengan nama Andri dan Budi, Gaji Andri 10 jt, dan gaji Budi 5 juta.
        Pajak untuk gaji diatas 6juta sebesar 3% dan dibawah 6 juta sebesar 2%
        Tentukan berapa gaji bersih andri dan budi
       **/ 
/**
 *
 * @author DELL LATITUDE
 */
public class tugas3 {
    public static void main(String[] args) {
       
        double gajiAndri = 1000000;
        double gajiBudi = 5000000;
        double pajak, gajiBersih;
        
        //pajak untuk gaji diatas 6jt sebesar 3%
        //pajak untuk gaji dibawah 6jt sebesar 2%
        
        if(gajiAndri==1000000){
            pajak = 0.03*gajiAndri;
            gajiBersih = gajiAndri - pajak;
            System.out.println("Gaji bersih Andri = "+gajiBersih);
        }
        
        if(gajiBudi==5000000){
            pajak = 0.02*gajiBudi;
            gajiBersih = gajiBudi - pajak;
            System.out.println("Gaji bersih Budi = "+gajiBersih);
        }
        
        
    }
}
