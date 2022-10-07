/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpertama;

import java.util.Scanner;

/**
 *
 * @author Noval
 */
public class Tugas_Percabangan {
    public static void main(String[] args) {
      System.out.println("Percabangan Kartu Hasil Studi");
      System.out.println("====================================");
        
      String nim, nama, prodi, matkul;
      int nilai;
      Scanner masukan = new Scanner (System.in);
      System.out.print("Masukkan NIM : ");
      nim = masukan.nextLine();
      System.out.print("Masukkan Nama : ");
      nama = masukan.nextLine();
      System.out.print("Matakuliah : ");
      matkul = masukan.nextLine();
      System.out.print("Masukkan Nilai Angka : ");
      nilai = masukan.nextInt();
        
      if (nilai >= 85 && nilai <= 100) {
        System.out.println("Nilai Predikat Anda A  ");
        System.out.println("(Sangat Memuaskan)");
      } else if (nilai >= 80 && nilai <= 84) {
        System.out.println("Nilai Predikat Anda A-  ");
        System.out.println("(Sangat Memuaskan)");
      } else if (nilai >= 75 && nilai <= 79) {
        System.out.println("Nilai Predikat Anda B+  ");
        System.out.println("(Memuaskan)");
      } else if (nilai >= 70 && nilai <= 74) {
        System.out.println("Nilai Predikat Anda B  ");
        System.out.println("(Memuaskan)");
      } else if (nilai >= 65 && nilai <= 69) {
        System.out.println("Nilai Predikat Anda B-  ");
        System.out.println("(Memuaskan)");
      } else if (nilai >= 60 && nilai <= 64) {
        System.out.println("Nilai Predikat Anda C+  ");
        System.out.println("(Cukup)");
      } else if (nilai >= 55 && nilai <= 59) {
        System.out.println("Nilai Predikat Anda C  ");
        System.out.println("(Cukup)");
      } else if (nilai >= 50 && nilai <= 54) {
        System.out.println("Nilai Predikat Anda C-  ");
        System.out.println("(Cukup)");
      } else if (nilai >= 45 && nilai <= 49) {
        System.out.println("Nilai Predikat Anda D  ");
        System.out.println("(Kurang)");
      } else if (nilai >= 0 && nilai <= 44) {
        System.out.println("Nilai Predikat Anda E  ");
        System.out.println("(Sangat Kurang)");
      } else {
        System.out.println("nilai tidak ditemukan");
      }
        
        
        System.out.println("==========Hasil Pengolahan Data===========");
//         ====mengambil jurusan nim=====
        prodi = nim.substring(3,5);
        System.out.println("Program Studi");
        switch (prodi) {
            case "52":
            System.out.println("S1 Teknologi Informasi");
            break;
            case "51":
            System.out.println("S1 Sistem Informasi");
            break;
            case "31":
            System.out.println("D3 Sistem Informasi");
            break;
            default :
            System.out.println("Tidak Ditemukan");
            break;
        }
   }
}
