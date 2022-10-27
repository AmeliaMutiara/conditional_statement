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
public class Kelulusan {
    public static void main(String[] args) {
        //membuat variabel
        String nama;
        int nilai;
        
        //membuat scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nama : ");
        nama = input.nextLine();
        System.out.println("Masukkan nilai : ");
        nilai = input.nextInt();
        
        //condition
        System.out.println("Hasil");
        if (nilai >= 75){
            System.out.println("Selamat " +nama+ " dinyatakan lulus");
        } else {
            System.out.println("Mohon maaf " +nama+ " anda dinyatakan tidak lulus");
        }
    }
}
