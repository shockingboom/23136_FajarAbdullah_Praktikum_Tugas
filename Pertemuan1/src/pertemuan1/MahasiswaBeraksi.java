/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan1;

/**
 *
 * @author Fajar Abdullah
 */
public class MahasiswaBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("Bergas", "Informatika", 5);
        Mahasiswa mhs2 = new Mahasiswa("Konjet", "Informatika", 6);
        Mahasiswa mhs3 = new Mahasiswa("Mukil", "Informatika", 8);
        
        mhs1.membaca();
        mhs2.nyontek();
        mhs3.modifikasi();
    }
    
}

