/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditionalstatements;

import java.util.Scanner;

/**
 *
 * @author AMEL
 */
public class Kesehatan {
    public static void main(String[] args) {
       //membuat variabel
        String kriteria1, kriteria2;
        
        //membuat scanner
        Scanner plyn = new Scanner(System.in);
        System.out.println("Apakah anda Memiliki KIS ? Ya | Tidak");
        kriteria1 = plyn.nextLine();
        System.out.println("Apakah anda Warga Setempat ? Ya | Tidak");
        kriteria2 = plyn.nextLine();
        
        //condition
        if (("Ya".equals(kriteria1)) == ("Ya".equals(kriteria2))) {
            System.out.println("Anda tidak dikenai pembayaran layanan");
        } else if (("Tidak".equals(kriteria1)) && ("Ya".equals(kriteria2))){
            System.out.println("Anda dikenai pembayaran layanan Rp. 7.500,00");
        } else if (("Tidak".equals(kriteria1)) && ("Tidak".equals(kriteria2))){
            System.out.println("Anda dikenai pembayaran layanan Rp. 10.000,00");
        } else {
            System.out.println("Mohon maaf kami tidak bisa melayani anda");
        } 
    }
}
