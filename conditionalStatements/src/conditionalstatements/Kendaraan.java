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
public class Kendaraan {
    public static void main(String[] args) {
        //membuat variabel
        int jumlah;
        
        //membuat scanner
        Scanner penumpang = new Scanner(System.in);
        System.out.println("Jumlah penumpang : ");
        jumlah = penumpang.nextInt();
        
        //condition
        switch (jumlah) {
            case 1 :
                System.out.println("Menggunakan Kendaraan Sepeda Ontel");
                break;
            case 2 :
                System.out.println("Menggunakan Kendaraan Sepeda Motor");
                break;
            case 3 :
                System.out.println("Menggunakan Kendaraan Becak");
                break;
            case 4 :
                System.out.println("Menggunakan Kendaraan Mobil");
                break;
            default :
                System.out.println("Mengguanakan Kendaraan Bus");
        }
    }
}
