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
public class Belanja {
    public static void main(String[] args) {
        //membuat variabel
        int bayar, totalBelanja;
        
        //membuat scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan total belanja : ");
        totalBelanja = input.nextInt();
        
        //condition
        if ((totalBelanja >= 100000) && (totalBelanja < 150000)){
            bayar = totalBelanja - 10000;
            System.out.println("Selamat anda mendapat diskon Rp. 10.000,00");
            System.out.println("Pembayaran total anda RP. "+bayar);
        } else if ((totalBelanja >= 150000) && (totalBelanja < 300000)){
            bayar = totalBelanja - 20000;
            System.out.println("Selamat anda mendapat diskon Rp. 20.000,00");
            System.out.println("Pembayaran total anda RP. "+bayar);
        } else if ((totalBelanja >= 300000) && (totalBelanja < 500000)){
            bayar = totalBelanja - 50000;
            System.out.println("Selamat anda mendapat diskon Rp. 50.000,00");
            System.out.println("Pembayaran total anda RP. "+bayar);
        } else if (totalBelanja >= 500000){
            bayar = totalBelanja - 75000;
            System.out.println("Selamat anda mendapat diskon Rp. 75.000,00");
            System.out.println("Pembayaran total anda RP. "+bayar);
        }
    }
}
