/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percabangan;

import java.util.Scanner;

/**
 *
 * @author Lab Aplikasi
 */
public class KonversiNilai {
     public static void main(String[] args) {
         String nim, nama, prodi, matkul;
         int nilai;
         Scanner masukan = new Scanner (System.in);
         System.out.print("Masukkan NIM = ");
         nim = masukan.nextLine();
         System.out.print("Masukkan Nama = ");
         nama = masukan.nextLine();
         System.out.print("Matakuliah = ");
         matkul = masukan.nextLine();
         System.out.print("Masukkan Nilai Angka = ");
         nilai = masukan.nextInt();
         System.out.println("==========Hasil Pengolahan Data===========");
//         ====mengambil jurusan nim=====
        prodi = nim.substring(3,5);
         System.out.println("Program Studi");
         switch (prodi) {
             case "52":
             System.out.println("Program Studi S_1 Teknolodi Informasi");
             break;
             case "51":
             System.out.println("Program Studi S_1 Sistem Informasi");
             break;
             case "31":
             System.out.println("Program Studi D_3 Sistem Informasi");
             break;
             default :
             System.out.println("Program Studi Tidak Ditemukan");
             break;
         }
//        if (prodi.equals("52")) {
//            System.out.println("Program Studi S_1 Teknolodi Informasi");
//        } else if (prodi.equals("51")) {
//            System.out.println("Program Studi S_1 Sistem Informasi");
//        } else if (prodi.equals("31")) {
//         System.out.println("Program Studi D_3 Sistem Informasi");
//        } else {
//            System.out.println("Program Studi Tidak Ditemukan");
//        }
       
         
     }
}
