import java.util.Scanner;
public class Pemilihan2Percobaan1 {

    public static void main(String[] args) {
        Scanner Absen = new Scanner(System.in);
        System.out.print("Masukkan nomor absen: ");
        int inputAbsen = Absen.nextInt();
        System.out.print("Masukan tahun: ");
        int tahun = Absen.nextInt();

        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0)
            System.out.println("Tahun kabisat");
        } else System.out.println("Bukan tahun kabisat");
    }
}