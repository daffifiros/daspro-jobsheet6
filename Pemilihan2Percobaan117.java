import java.util.Scanner;
public class Pemilihan2Percobaan117 {

    public static void main(String[] args) {
        Scanner input17 = new Scanner(System.in);
        System.out.print("Masukkan tahun: ");
        int tahun = input17.nextInt();

        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0)
            System.out.println("Tahun kabisat");
        } else System.out.println("Bukan tahun kabisat");
    }
}