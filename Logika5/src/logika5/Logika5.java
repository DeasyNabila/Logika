/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logika5;

import java.util.Scanner;

/**
 *
 * @author MOKLET-1
 */
public class Logika5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int maksimum, jumlah, i, lokasi = 1, array[];
    Scanner scan = new Scanner(System.in);
    System.out.print("Masukkan jumlah elemen: ");
    jumlah = scan.nextInt();
    array = new int[jumlah];
    
    System.out.println("Masukkan "+jumlah+" angka");
    for(i = 0; i < jumlah; i++) {
      System.out.print("Elemen ke-"+ (i+1) +": " );
      array[i] = scan.nextInt();
    }
    maksimum = array[0];
    for(i = 0; i < jumlah; i++) {
      if (array[i] > maksimum){
        maksimum = array[i];
        lokasi = i+1;
      }
    }
    System.out.println("Nilai maksimum  adalah "+maksimum);
    
  }
}
   
