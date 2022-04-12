/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logika3;

import java.util.Scanner;

/**
 *
 * @author MOKLET-1
 */
public class Logika3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int bil;
        int total = 0;
        
        System.out.println("Masukkan bilangan : ");
        bil = input.nextInt();
        
        for(int i = 1; i <= bil; i++){
            System.out.print(i+" + ");
            total += i;
        }
        System.out.println("= "+total);
    }
}
    
