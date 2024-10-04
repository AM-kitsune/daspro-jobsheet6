import java.util.Scanner;

public class Pemilihan2_Percobaan1_13_2 {
   public Pemilihan2_Percobaan1_13_2() {
   }

   public static void main(String[] var0) {
      Scanner Tigabelas = new Scanner(System.in);
      System.out.print("Masukkan Tahun: ");
      int tahun = Tigabelas.nextInt();
      if (tahun % 100 == 0) {
         if (tahun % 400 != 0) {
            System.out.println("Tahun Kabisat");
         }
      } else {
         System.out.println("Bukan Tahun Kabisat");
      }

   }
}
