public class pemilihan2_percobaan1_13_tahunKKabisat_NO4 {
    public static void main(String[] args) {
        int tahun = 2000;

        if (tahun % 4 == 0) {
            if (tahun % 100 == 0) {
                if (tahun % 400 == 0) {
                    System.out.println(tahun + " adalah tahun kabisat.");
                } else {
                    System.out.println(tahun + " bukan tahun kabisat.");
                }
            } else {
                System.out.println(tahun + " adalah tahun kabisat.");
            }
        } else {
            System.out.println(tahun + " bukan tahun kabisat.");
        }
    }
}