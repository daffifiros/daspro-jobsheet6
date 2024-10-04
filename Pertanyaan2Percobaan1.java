    import java.util.Scanner;

    public class Pertanyaan2Percobaan1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Meminta input dari user
            System.out.print("Masukkan tahun: ");
            int tahun = scanner.nextInt();

            // Mengecek apakah tahun kabisat atau bukan
            if (tahun % 4 == 0) {
                if (tahun % 100 == 0) {
                    if (tahun % 400 == 0) {
                        System.out.println("tahun kabisat");
                    } else {
                        System.out.println("bukan tahun kabisat");
                    }
                } else {
                    System.out.println("tahun kabisat");
                }
            } else {
                System.out.println("bukan tahun kabisat");
            }
        }
    }
