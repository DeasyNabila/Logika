/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logika8;

import java.util.Scanner;

/**
 *
 * @author MOKLET-1
 */
public class Logika8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner userInput = new Scanner(System.in);
        System.out.print("Inputkan jumlah buah: ");
        int jumlahBuah = userInput.nextInt();
        String[] namaBuah = new String[jumlahBuah];
        int[] banyakBuah = new int[jumlahBuah];
        masukkanNamaDanBanyakBuah(userInput, jumlahBuah, namaBuah, banyakBuah);
        int hasil = buahTerbanyak(jumlahBuah, namaBuah, banyakBuah);

        System.out.println("Nominal buah terbanyak: " + hasil);
    }

    static void masukkanNamaDanBanyakBuah(Scanner userInput, int jumlahBuah, String[] namaBuah, int[] banyakBuah) {
        for (int i = 0; i < jumlahBuah; i++) {
            System.out.print("Masukkan nama buah " + (i + 1) + ": ");
            namaBuah[i] = userInput.next();
            System.out.print("Masukkan banyak buah " + namaBuah[i] + ": ");
            banyakBuah[i] = userInput.nextInt();
        }
    }

    static int buahTerbanyak(int jumlahBuah, String[] namaBuah, int[] banyakBuah) {
        String namaBuahTerbanyak = "";
        int jumlahBuahTerbanyak = 0;
        for (int i = 0; i < jumlahBuah; i++) {
            if (banyakBuah[i] > jumlahBuahTerbanyak) {
                jumlahBuahTerbanyak = banyakBuah[i];
                namaBuahTerbanyak = namaBuah[i];
            }
        }
        System.out.println("Buah terbanyak adalah " + namaBuahTerbanyak + " (" + jumlahBuahTerbanyak + ")");
        return jumlahBuahTerbanyak;
    }

}
