import java.util.Scanner;

public class Pertanyaan4Percobaan1 {
    public static void main(String[] args) {
        Scanner input17 = new Scanner(System.in);
        System.out.print("Masukkan tahun: ");
        int tahun = input17.nextInt();
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
