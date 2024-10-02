import java.util.Scanner;
public class Pemilihan2Percobaan1_13 {
    public static void main(String[] args) {
        Scanner TigaBelas = new Scanner(System.in);

        System.out.print("Masukkan Tahun: ");
        int tahun = TigaBelas.nextInt();
     
        if (( tahun % 4) == 0) {
            if((tahun % 100)!= 0 )
            System.out.println("Tahun Kabisat");
        }else
            System.out.println("Bukan Tahun Kabisat");



    }
}
