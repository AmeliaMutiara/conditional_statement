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
public class Bookstore {
    public static void main(String[] args) {
        //membuat variabel
        int buku;
        
        //membuat scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Banyak buku yang dipinjam : ");
        buku = input.nextInt();
        
        //condition
        switch (buku) {
            case 1 :
                System.out.println("Total Bayar : Rp. 10.000,00");
                break;
            case 2 :
                System.out.println("Total Bayar : Rp. 20.000,00");
                break;
            case 3 :
                System.out.println("Total Bayar : Rp. 30.000,00");
                break;
            case 4 :
                System.out.println("Total Bayar : Rp. 40.000,00");
                System.out.println("Diskon      : 2,5%");
                break;
            case 5 :
                System.out.println("Total Bayar : Rp. 50.000,00");
                System.out.println("Diskon      : 5%");
                break;
            case 10 :
                System.out.println("Total Bayar : Rp. 100.000,00");
                System.out.println("Diskon      : 10%");
                break;
            default :
                System.out.println("Tunggu sebentar...");
        }
    }
}
