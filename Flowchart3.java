import java.util.Scanner;

public class Flowchart3 {
    public static void main(String[] args) {
        Scanner input17 = new Scanner(System.in);

        String merek, kategori;
        byte ukuran;

        System.out.println("------------------------------------------------------------");
        System.out.println("=========================== DAFTAR MERK SEPATU ===========================");
        System.out.println("------------------------------------------------------------");
        System.out.println("Merk (Specs/910/Ortus)");
        System.out.println("Kategori Ukuran Specs : Slip on (36-40) / High Top (40-44)");
        System.out.println("Kategori Ukuran 910 : Woman (36-41) / Man (41-44)");
        System.out.println("Kategori Ukuran Ortus : Kids (36-40) / Adult (40-44)");

        System.out.print("Masukkan Merek (Specs/910/Ortus) : ");
        merek = input17.nextLine();
        System.out.print("Masukkan Kategori : ");
        kategori = input17.nextLine();
        System.out.print("Masukkan Ukuran : ");
        ukuran = input17.nextByte();
        input17.nextLine();

        if (merek.equalsIgnoreCase("Specs")) {
            if (kategori.equalsIgnoreCase("Slip on")) {
                if (ukuran >= 36 && ukuran <= 40) {
                    System.out.println("Harga: 800.000");
                } else {
                    System.out.println("Invalid");
                }
            } else if (kategori.equalsIgnoreCase("High top")) {
                if (ukuran >= 40 && ukuran <= 44) {
                    System.out.println("Harga: 1.200.000");
                } else {
                    System.out.println("Invalid");
                }
            } else {
                System.out.println("Invalid");
            }

        } else if (merek.equalsIgnoreCase("910")) {
            if (kategori.equalsIgnoreCase("Woman")) {
                if (ukuran >= 36 && ukuran <= 41) {
                    System.out.println("Harga: 1.000.000");
                } else {
                    System.out.println("Invalid");
                }
            } else if (kategori.equalsIgnoreCase("Man")) {
                if (ukuran >= 41 && ukuran <= 44) {
                    System.out.println("Harga: 1.800.000");
                } else {
                    System.out.println("Invalid");
                }
            } else {
                System.out.println("Invalid");
            }

        } else if (merek.equalsIgnoreCase("Ortus")) {
            if (kategori.equalsIgnoreCase("Kids")) {
                if (ukuran >= 36 && ukuran <= 40) {
                    System.out.println("Harga: 750.000");
                } else {
                    System.out.println("Invalid");
                }
            } else if (kategori.equalsIgnoreCase("Adult")) {
                if (ukuran >= 40 && ukuran <= 44) {
                    System.out.println("Harga: 1.500.000");
                } else {
                    System.out.println("Invalid");
                }
            } else {
                System.out.println("Invalid"); 
            }

        } else {
            System.out.println("Invalid");
        }
    }
}
