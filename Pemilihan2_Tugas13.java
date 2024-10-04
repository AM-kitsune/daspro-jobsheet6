import java.util.Scanner;
public class Pemilihan2_Tugas13 {
    public static void main(String[] args) {
        Scanner Tigabelas = new Scanner(System.in);
        String jnsBuku;
        int jumlahBuku, hargaBuku = 20000;
        double hargaBayar, diskon, hargaKotor;

        System.out.println("Masukkan Jenis Buku: ");
        jnsBuku = Tigabelas.nextLine();
        System.out.println("Masukkan Jumlah Buku yang Dibeli");
        jumlahBuku = Tigabelas.nextInt();

        if (jnsBuku.equalsIgnoreCase("Kamus")) {
            if (jumlahBuku > 2) {
            hargaKotor = jumlahBuku*hargaBuku;
            diskon = hargaKotor*0.1 + hargaKotor*0.02;
            hargaBayar = hargaKotor - diskon;

            } else {
            hargaKotor = jumlahBuku*hargaBuku;
            diskon = hargaKotor*0.02;
            hargaBayar = hargaKotor - diskon;
            }
        } else if (jnsBuku.equalsIgnoreCase("Novel")) {
            if (jumlahBuku > 3) {
            hargaKotor = jumlahBuku*hargaBuku;
            diskon = hargaKotor*0.07 + hargaKotor*0.02;
            hargaBayar = hargaKotor - diskon;

            } else {
            hargaKotor = jumlahBuku*hargaBuku;
            diskon = hargaKotor*0.08;
            hargaBayar = hargaKotor - diskon;
            }
        } else {
            if (jumlahBuku > 3) {
            hargaKotor = jumlahBuku*hargaBuku;
            diskon = hargaKotor*0.05;
            hargaBayar = hargaKotor - diskon;

            } else {
            hargaKotor = jumlahBuku*hargaBuku;
            diskon = 0;
            hargaBayar = hargaKotor - diskon;
            }
        }
            System.out.println("Harga Bayar " + hargaBayar );
            System.out.println("Diskon " + diskon);
    }
}
