/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vivianforliana;
import java.util.Scanner;

/**
 *
 * @author A-25
 */
public class VivianPertemuan2 {
    public static void main(String[] args) {
        int nilaiA = 10;
        int nilaiB = 20;
        double nilaiC = 10.1;
        double nilaiD = 20.1;
        boolean isPlus = true;
        System.out.println("nilaiA = " + nilaiA);
        System.out.println("nilaiB =" + nilaiB);
        System.out.println("nilaiC =" + nilaiC);
        System.out.println("nilaiD =" + nilaiD);
        System.out.println("isPlus =" + isPlus);
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan nilai baru untuk nilaiA (int): ");
        nilaiA = input.nextInt();
        
        System.out.println("Masukkan nilai baru untuk nilaiB (int): ");
        nilaiB = input.nextInt();
       
        System.out.println("Masukkan nilai baru untuk nilaiC (double): ");
        nilaiC = input.nextDouble();
        
        System.out.println("Masukkan nilai baru untuk nilaiD (double): ");
        nilaiD = input.nextDouble();
        
        System.out.println("Masukkan nilai baru untuk isPlus (true/false): ");
        isPlus = input.nextBoolean();
        
        System.out.println("nilaiA = " + nilaiA);
        System.out.println("nilaiB = " + nilaiB);
        System.out.println("nilaiC = " + nilaiC);
        System.out.println("nilaiD = " + nilaiD);
        System.out.println("isPlus = " + isPlus);
        
        input.nextLine();
        System.out.println("Masukkan nilai untuk variabel String: ");
        String stringVar = input.nextLine();
        System.out.println("stringVar = " + stringVar);
    }
}