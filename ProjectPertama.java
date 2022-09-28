/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectpertama;

import java.util.Scanner;

/**
 *
 * @author Lab Aplikasi
 */
public class ProjectPertama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nik, nama, tmplahir, tglahir, alamat;
        int usia;
        String jkel;
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan NIK = ");
        nik = in.nextLine();
        System.out.print("Masukkan Nama = ");
        nama = in.nextLine();
        System.out.print("Masukkan Tempat Lahir = ");
        tmplahir = in.nextLine ();
        System.out.print("Masukkan Tanggal Lahir = ");
        tglahir = in.nextLine ();
        System.out.print("Masukkan Alamat = ");
        alamat = in.nextLine();
        System.out.print("Masukkan Usia = ");
        usia = in.nextInt();
        System.out.print("Masukkan Jenis Kelamin [L/P] = ");
        jkel = in.next(); 
        System.out.println(" Identitas Pribadi Kamu = ");
        System.out.println("=============================================");
        System.out.println("NIK = " +nik);
        System.out.println("Nama = " +nama);
        System.out.println("Tempat, Tanggal Lahir = " +tmplahir + " "+tglahir);
        System.out.println("Alamat = " +alamat);
        System.out.println("Usia = " +usia);
        System.out.println("Jenis Kelamin = " +jkel);
        
//        String nama ="Revani";
//        String nik ="350725";
//        String tmplahir ="Malang", tgllahir = "14-04-2003";
//        int usia =19;
//        char jkel ='p';
//        final double bb = 45.55;
//        System.out.println("Identitas Pribadi");
//        System.out.println("====================================");
//        System.out.println("Nomor Induk Kependudukan :" + nik);
//        System.out.println("Namaku :" + nama);
//        System.out.println("Usiaku :" + usia);
//        System.out.println("Jkelku :" + jkel);
//        System.out.format("Tempat, Tanggal Lahir : %s %s %n", tmplahir,tgllahir);
//        System.out.println("Berat Badan =" +bb);
        
    }
    
}
