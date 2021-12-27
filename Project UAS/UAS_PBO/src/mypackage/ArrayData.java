/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mypackage;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class ArrayData {
    ArrayList<Integer> kode = new ArrayList<Integer>();
    ArrayList<String> nama = new ArrayList<String>();
    ArrayList<String> gol = new ArrayList<String>();
    ArrayList<Integer> usia = new ArrayList<Integer>();
    ArrayList<Integer> status = new ArrayList<Integer>();
    ArrayList<Integer> anak = new ArrayList<Integer>();
    
    void inputTambah() {
        while(true){
            Scanner input = new Scanner(System.in);
            System.out.println("Silahakan masukkan data karyawan!");
            System.out.print("Masukkan kode karyawan: ");
            kode.add(input.nextInt());
            
            System.out.print("Masukkan nama karyawan: ");
            nama.add(input.nextLine());
            
            System.out.print("Masukkan golongan karyawan (A/B/C/D): ");
            gol.add(input.nextLine());
            
            System.out.print("Masukkan usia karyawan: ");
            usia.add(input.nextInt());
            
            System.out.print("Masukkan status pernikahan (0=belum menikah; 1=sudah menikah): ");
            int nikah = input.nextInt();
            status.add(nikah);
            
            if(nikah == 1){
                System.out.print("Masukkan jumlah anak: ");
                anak.add(input.nextInt());
            }

            System.out.println("========================");
            System.out.println("Pilih SubMenu:");
            System.out.println("------------------------");
            System.out.println("1. Kembali ke menu utama");
            System.out.println("2. Tambah Data Kembali");
            System.out.println("========================");
            System.out.print("Menu pilihan: ");
            char ans = input.nextLine().charAt(0);
            if (ans == '1'){
                break;
            }
        }
    }
    
    void inputHapus(){
        while(true){
            Scanner input = new Scanner(System.in);
            System.out.print("Kode Karyawan yang mau dihapus: ");
            int pilihan = input.nextInt();
        
            int getIndex = Arrays.asList(kode).indexOf(pilihan);
            kode.remove(getIndex);
            nama.remove(getIndex);
            gol.remove(getIndex);
            usia.remove(getIndex);
            if(status.get(getIndex) == 1){
                anak.remove(getIndex);
            }
            status.remove(getIndex);

            System.out.println("========================");
            System.out.println("Pilih SubMenu:");
            System.out.println("------------------------");
            System.out.println("1. Kembali ke menu utama");
            System.out.println("2. Hapus Data Kembali");
            System.out.println("========================");
            System.out.print("Menu pilihan: ");
            char ans = input.nextLine().charAt(0);
            if (ans == '1'){
                break;
            }
        }
    }
    
    void inputLihat(){
        
    }
    
    void inputCari(){
        int kotor = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Kode Karyawan: ");
        int pilihan = input.nextInt();
        
        int getIndex = Arrays.asList(kode).indexOf(pilihan);
        
        System.out.println("========================================");
        System.out.println("DATA PROFILE KARYAWAN");
        System.out.println("----------------------------------------");
        System.out.println("Kode Karyawan         : " + kode.get(getIndex));
        System.out.println("Nama Karyawan         : " + nama.get(getIndex));
        System.out.println("Golongan              : " + gol.get(getIndex));
        System.out.println("Usia                  : " + usia.get(getIndex));
        if(status.get(getIndex) == 1){
            System.out.println("Status Menikah        : Menikah");
            System.out.println("Jumlah Anak           : " + anak.get(getIndex));
        } else {
            System.out.println("Status Menikah        : Belum Menikah");
        }
        System.out.println("----------------------------------------");
//        Gaji Pokok
        if(gol.get(getIndex).equals("A")){
            kotor = 5000000;
            System.out.println("Gaji Pokok            : Rp 5.000.000,-");
        } else if(gol.get(getIndex).equals("B")){
            kotor = 6000000;
            System.out.println("Gaji Pokok            : Rp 6.000.000,-");
        } else if(gol.get(getIndex).equals("C")){
            kotor = 7000000;
            System.out.println("Gaji Pokok            : Rp 7.000.000,-");
        }
        
//        Tunjangan Istri/Suami
        if(status.get(getIndex) == 1){
            if(gol.get(getIndex).equals("A")){
                kotor += 500000;
                System.out.println("Tunjangan Istri/Suami : Rp 500.000,-");
            } else if(gol.get(getIndex).equals("B")){
                kotor += 600000;
                System.out.println("Tunjangan Istri/Suami : Rp 600.000,-");
            } else if(gol.get(getIndex).equals("C")){
                kotor += 700000;
                System.out.println("Tunjangan Istri/Suami : Rp 700.000,-");
            }
        } else {
            System.out.println("Tunjangan Istri/Suami : Rp 0,-");
        }
        
//        Tunjangan Pegawai
        if(usia.get(getIndex) > 30){
            if(gol.get(getIndex).equals("A")){
                kotor += 750000;
                System.out.println("Tunjangan Pegawai     : Rp 750.000,-");
            } else if(gol.get(getIndex).equals("B")){
                kotor += 900000;
                System.out.println("Tunjangan Pegawai     : Rp 900.000,-");
            } else if(gol.get(getIndex).equals("C")){
                kotor += 1050000;
                System.out.println("Tunjangan Pegawai     : Rp 1.050.000,-");
            }
        } else {
            System.out.println("Tunjangan Pegawai     : Rp 0,-");
        }
        
//        Tunjangan Anak
        if(status.get(getIndex) == 1){
            if(anak.get(getIndex) > 0){
                if(gol.get(getIndex).equals("A")){
                    int gaji = 5000000;
                    int jmlAnk = anak.get(getIndex);
                    double tunjangan = 0;
                    tunjangan = 0.05 * jmlAnk * gaji;
                    kotor += tunjangan;
                    System.out.println("Tunjangan Anak        : Rp " + tunjangan + ",-");
                } else if(gol.get(getIndex).equals("B")){
                    int gaji = 6000000;
                    int jmlAnk = anak.get(getIndex);
                    double tunjangan = 0;
                    tunjangan = 0.05 * jmlAnk * gaji;
                    kotor += tunjangan;
                    System.out.println("Tunjangan Anak        : Rp " + tunjangan + ",-");
                } else if(gol.get(getIndex).equals("C")){
                    int gaji = 7000000;
                    int jmlAnk = anak.get(getIndex);
                    double tunjangan = 0;
                    tunjangan = 0.05 * jmlAnk * gaji;
                    kotor += tunjangan;
                    System.out.println("Tunjangan Anak        : Rp " + tunjangan + ",-");
                }
            } else {
                System.out.println("Tunjangan Anak        : Rp 0,-");
            }
        } else {
            System.out.println("Tunjangan Anak        : Rp 0,-");
        }
        System.out.println("---------------------------------------- +");
        System.out.println("Gaji Kotor            : Rp " + kotor + ",-");
        double potongan = 0.025 * kotor;
        System.out.println("Potongan              : Rp " + potongan + ",-");
        System.out.println("---------------------------------------- -");
        double bersih = kotor - potongan;
        System.out.println("Gaji Bersih           : Rp " + bersih + ",-");
        System.out.println("");
        
        System.out.println("========================");
        System.out.println("Pilih SubMenu:");
        System.out.println("------------------------");
        System.out.println("1. Kembali ke menu utama");
        System.out.println("2. Hapus Data Kembali");
        System.out.println("========================");
        System.out.print("Menu pilihan: ");
        char ans = input.nextLine().charAt(0);
        if (ans == '1'){
            System.exit(0);
        }
    }
}
