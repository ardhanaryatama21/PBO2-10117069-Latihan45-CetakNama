/*
 * @author
 * Nama   : Muhammad Ardhan Aryatama
 * Kelas  : PBO2
 * NIM    : 10117069
 * Deskripsi Program : program ini dibuat untuk menampilkan value ke program 
                       Cetak Nama
 */
package pbo2.pkg10117069.latihan45.cetaknama;

import java.util.Scanner;

public class PBO210117069Latihan45CetakNama {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Printer ptr = new Printer();
        System.out.println("=====Aplikasi Pencetak Nama=====");
        System.out.print("Masukkan Nama Anda : ");
        ptr.setNama(sc.nextLine());
        System.out.print("Mau cetak nama berapa kali? : ");
        ptr.setJmlCetak(sc.nextInt());
        ptr.cetak(ptr.getNama());
        ptr.cetak(ptr.getJmlCetak(), ptr.getNama());
        
    }
    
}
