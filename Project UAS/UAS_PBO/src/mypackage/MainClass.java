/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mypackage;


import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        ArrayList<Integer> kode = new ArrayList<Integer>();
        ArrayList<String> nama = new ArrayList<String>();
        ArrayList<String> gol = new ArrayList<String>();
        ArrayList<String> usia = new ArrayList<String>();
        ArrayList<Integer> status = new ArrayList<Integer>();
        ArrayList<String> anak = new ArrayList<String>();
        
        ArrayData a = new ArrayData();
        
        CommandLineTable st = new CommandLineTable();
        
        
        while(true){
            System.out.println("================");
            System.out.println("Menu Utama");
            System.out.println("----------------");
            System.out.println("1. Tambah Data");
            System.out.println("2. Hapus Data");
            System.out.println("3. Cari Data");
            System.out.println("4. Lihat Data");
            System.out.println("5. Exit");
            System.out.println("================");
            System.out.print("Menu Pilihan: ");
            int menu = input.nextInt();
            
            switch(menu) {
                case 1: {
                    a.inputTambah();
                    break;
                }
                case 2: {
                    a.inputHapus();
                    break;
                }
                case 3: {
                    st.setShowVerticalLines(true);
                    st.setHeaders("KODE KARY", "NAMA KARY", "GOL", "USIA", "STATUS NIKAH", "JUMLAH ANAK");;
                    break;
                }
                case 4: {
                    System.exit(0);
                    break;
                }
                default: {
                   break;
               }
            }
        }
    }
}
