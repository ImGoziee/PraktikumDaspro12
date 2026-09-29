import java.util.Scanner;

public class tugas2SeleksiAsisten12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String statusAktif;
        String sanksiAkademik;
        String sertifikat;
        int nilaiDasarPemrograman;
        int nilaiWawancara;

        System.out.print("Apakah mahasiswa berstatus aktif? (ya/tidak): ");
        statusAktif = sc.nextLine();

        System.out.print("Apakah mahasiswa sedang mendapatkan sanksi akademik? (ya/tidak): ");
        sanksiAkademik = sc.nextLine();

        if (statusAktif.equalsIgnoreCase("ya") && sanksiAkademik.equalsIgnoreCase("tidak")) {

            System.out.print("Masukkan nilai Dasar Pemrograman: ");
            nilaiDasarPemrograman = sc.nextInt();

            sc.nextLine();
            System.out.print("Apakah punya sertifikat kompetensi pemrograman?: ");
            sertifikat = sc.nextLine();

            if (nilaiDasarPemrograman >= 80 || sertifikat.equalsIgnoreCase("ya")) {

                System.out.println("Mahasiswa dipanggil untuk mengikuti wawancara");

                System.out.print("Masukkan nilai wawancara: ");
                nilaiWawancara = sc.nextInt();

                if (nilaiWawancara >= 75) {
                    System.out.println("Mahasiswa diterima jadi asisten praktikum");
                } else {
                    System.out.println("Mahasiswa gagal di tahap wawancara");
                    System.out.println("nilai wawancara kurang dari 75");
                }
            } else {
                System.out.println("Mahasiswa gagal mengikuti wawancara");
                System.out.println("nilai daspro kurang dari 80 dan tidak punya sertifikat kompetensi pemrograman");
            }

        } else {
            System.out.println("Mahasiswa gagal di tahap administrasi");

            if (!statusAktif.equalsIgnoreCase("ya") && sanksiAkademik.equalsIgnoreCase("ya")) {
                System.out.println("karna Mahasiswa tidak berstatus aktif dan sedang mendapatkan sanksi akademik");
            } else if (!statusAktif.equalsIgnoreCase("ya")) {
                System.out.println("karna mahasiswa tidak berstatus aktif.");
            } else {
                System.out.println("karna mahasiswa sedang mendapatkan sanksi akademik.");
            }
        }
    }
}
