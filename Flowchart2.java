import java.util.Scanner;
public class Flowchart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String jenisBuku;
        int jumlahBuku;
        double diskon = 0;

        System.out.print("Masukkan jenis buku: ");
        jenisBuku = scanner.nextLine();
        System.out.print("Masukkan jumlah buku: ");
        jumlahBuku = scanner.nextInt();

        if (jenisBuku.equalsIgnoreCase("Kamus") && jumlahBuku >= 3) {
            System.out.println("Diskon 5%");
        } else if (jenisBuku.equalsIgnoreCase("Kamus") && jumlahBuku >= 2) {
            System.out.println("Diskon 12%");
        } else if (jenisBuku.equalsIgnoreCase("Novel") && jumlahBuku >= 3) {
            System.out.println("Diskon 9%");
        } else if (jenisBuku.equalsIgnoreCase("Novel") && jumlahBuku >= 2) {
            System.out.println("Diskon 8%");
        } else {
            System.out.println("Jenis buku tidak valid");
            
        }
    }
}
