/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;

public class latihan37 {
    
     public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan banyak mahasiswa : ");    
        int jumlah = scanner.nextInt();

        penilaian penilaian = new penilaian(jumlah);

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Nilai Mahasiswa ke-"+ (i+1) + " : ");    
            penilaian.setNilai(i, scanner.nextInt());
        }

        penilaian.averagePenilaian();

    }


    
}
