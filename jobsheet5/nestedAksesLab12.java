package jobsheet5;

import java.util.Scanner;

public class nestedAksesLab12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean mahasiswaAktif;
        boolean sedangDisanksi;
        boolean punyaIzinDosen;
        boolean asistenLab;

        System.out.print("Apakah pengguna mahasiswa aktif? (true/false): ");
        mahasiswaAktif = sc.nextBoolean();
        System.out.print("Apakah pengguna sedang disanksi? (true/false): ");
        sedangDisanksi = sc.nextBoolean();
        System.out.print("Apakah pengguna punya izin dosen? (true/false): ");
        punyaIzinDosen = sc.nextBoolean();
        System.out.print("Apakah pengguna asisten lab? (true/false): ");
        asistenLab = sc.nextBoolean();

        // mahasiswaAktif && !sedangDisanksi && (punyaIzinDosen || asistenLab)

        
        if (mahasiswaAktif && !sedangDisanksi) {
            if (punyaIzinDosen || asistenLab) {
                System.out.println("Akses laboratorium diberikan");
            } else {
                System.out.println("Akses ditolak: membutuhkan izin dosen atau status asisten lab"); 
            } 
        } else { 
            System.out.println("Akses ditolak: status mahasiswa tidak memenuhi syarat");
        }
    }
}
