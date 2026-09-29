package assignment;
import java.util.Scanner;

public class sistemDiskonTokoBuku12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String jenisBuku;
        int jumlahBuku;
        double diskon;

        System.out.print("Masukkan jenis buku: ");
        jenisBuku = sc.nextLine();

        System.out.print("Masukkan jumlah buku: ");
        jumlahBuku = sc.nextInt();

        if (jenisBuku.equals("kamus")) {
            if (jumlahBuku > 2) {
                diskon = 0.12;
            } else {
                diskon = 0.10;
            }
        } else if (jenisBuku.equals("novel")) {
            if (jumlahBuku > 3) {
                diskon = 0.09;
            } else {
                diskon = 0.08;
            }
        } else {
            if (jumlahBuku > 3) {
                diskon = 0.05;
            } else {
                diskon = 0;
            }
        }
        int diskonPercentage = (int) (diskon * 100);
        System.out.println("Diskon: " + diskonPercentage + "%");
    }
}