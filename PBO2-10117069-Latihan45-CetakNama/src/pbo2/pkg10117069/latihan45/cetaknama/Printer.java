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

public class Printer {
    private int jmlCetak;
    private String nama;
    
    Scanner sc = new Scanner(System.in);

    public int getJmlCetak() {
        return jmlCetak;
    }

    public void setJmlCetak(int jmlCetak) {
        this.jmlCetak = jmlCetak;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void cetak(String nama){
        System.out.println("Nama Anda : " + nama);
    }
    
    public void cetak(int jmlCetak, String nama){
        System.out.println("Hasil Cetak : ");
        for(int i=1; i<=jmlCetak; i++){
            System.out.println(i + ". " + nama);
        } 
    }
}
