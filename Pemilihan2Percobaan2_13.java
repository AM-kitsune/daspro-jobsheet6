import java.util.Scanner;
public class Pemilihan2Percobaan2_13 {
    public static void main(String[] args) {
        
        Scanner Tigabelas = new Scanner(System.in);
        int pilihan_menu;
        String member, pembayaran;
        double diskon, harga, total_bayar;


        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("--------------------------------------");
        System.out.print("masukkan angka dari menu yang dipilih = ");
        pilihan_menu = Tigabelas.nextInt();
        Tigabelas.nextLine();
        System.out.print("Pembayaran QRIS (y/n) ? = ");
        pembayaran = Tigabelas.nextLine();
        System.out.print("Apakah punya member (y/n) ? = ");
        member = Tigabelas.nextLine();
        System.out.println("--------------------------------------");
        
    if (pembayaran.equals("y")) {
        if (member.equals("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);
            
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);

            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);

            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }
            total_bayar = harga - (harga * diskon) - 1000;
            System.out.println("Total bayar setelah diskon = " + total_bayar);
        }
        
        else if (member.equals("n")) {
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);

            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);

            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            } 
            total_bayar = harga - 1000;
            System.out.println("Total bayar = " + total_bayar);
         }
    } else if (pembayaran.equals("n")) {
        if (member.equals("y")) {
            diskon = 0.10;
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);
            
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);

            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);

            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }
            total_bayar = harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon = " + total_bayar);
            }
        
        else if (member.equals("n")) {
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);

            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);

            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            } 
            System.out.println("Total bayar = " + harga);
            } 
        
    } else {
        System.out.println("Member tidak valid");
    }
    System.out.println("--------------------------------------");
    }
}
