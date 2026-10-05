import java.util.Scanner;

public class StudiKasus2_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String namaMahasiswa;
        String jenisKegiatan;
        int jumlahDokumen;
        int peringkatJuara;
        int statusPendanaanPKM;

        System.out.print("Nama mahasiswa  : ");
        namaMahasiswa = sc.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        jenisKegiatan = sc.nextLine();

        System.out.print("Jumlah dokumen  : ");
        jumlahDokumen = sc.nextInt();

        System.out.print("Peringkat juara : ");
        peringkatJuara = sc.nextInt();

        if (jumlahDokumen < 4) {
            int kurang = 4 - jumlahDokumen;
            System.out.println("Status: Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");

        } else {

            if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || jenisKegiatan.equalsIgnoreCase("BAKORMA") || jenisKegiatan.equalsIgnoreCase("MANDIRI")) {

                if (peringkatJuara == 1 || peringkatJuara == 2 || peringkatJuara == 3) {

                    System.out.println("Status: Dokumen lengkap. " + "Peringkat " + peringkatJuara + ". Dana penghargaan diberikan.");

                } else {
                    System.out.println("Status: Dokumen lengkap. " + "Tidak masuk peringkat 1, 2, atau 3. " + "Dana penghargaan tidak diberikan.");
                }

            } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {

                System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos) : ");

                statusPendanaanPKM = sc.nextInt();

                if (statusPendanaanPKM == 1) {

                    System.out.println("Status: Dokumen lengkap. " + "PKM lolos pendanaan. Dana penghargaan diberikan.");

                } else {

                    System.out.println("Status: Dokumen lengkap. " + "PKM tidak lolos pendanaan. Dana penghargaan tidak diberikan.");

                }

            } else {

                System.out.println("Status: Dokumen lengkap. " + "Jenis kegiatan tidak termasuk BELMAWA, BAKORMA, " + "MANDIRI, atau PKM. Dana penghargaan tidak diberikan.");
            }
        }
    }
}