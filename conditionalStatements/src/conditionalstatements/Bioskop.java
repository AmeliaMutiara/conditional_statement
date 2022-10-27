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
public class Bioskop {
    public static void main(String[] args) {
        //membuat variabel
        int umur;
        
        //membuat scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Umur Penonton : ");
        umur = input.nextInt();
        
        //condition
        switch (umur) {
            case 10 :
                System.out.println("Film Car 2");
                break;
            case 15 :
                System.out.println("Film Frozen II");
                break;
            case 17 :
                System.out.println("Film Mulan");
                break;
            case 20 :
                System.out.println("Film Beauty And The Beast");
                break;
            default :
                System.out.println("Film Encanto");
        }
    }
}
