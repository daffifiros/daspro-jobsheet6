// import java.util.Scanner;
// public class Pemilihan2Percobaan217 {
//     public static void main(String[] args) {
//         Scanner input17 = new Scanner (System.in);
//         String member;
//         double harga, diskon, totalHarga;

//         System.out.println("-------------------------");
//         System.out.println("===== MENU KAFE JTI =====");
//         System.out.println("-------------------------");
//         System.out.println("1. Ricebowl");
//         System.out.println("2. Ice Tea");
//         System.out.println("3. Paket bunding (Ricebowl + Ice Tea)");
//         System.out.println("----------------------------------");
//         System.out.println("Masukkan angka dari menu yang dipilih = ");
//         int pilihan_menu = input17.nextInt();
//         input17.nextLine();
//         System.out.println("Apakah punya member (y/n) ? = ");
//         member = input17.nextLine();

// if (member.equalsIgnoreCase("y")) { 
//     diskon = 0.10;
//     System.out.println("Besar diskon = 10%");
//     if (pilihan_menu == 1) {
//         harga = 14000;
//         System.out.println("Harga ricebowl = " + harga);

//     } else if (pilihan_menu == 2) {
//         harga = 3000;
//         System.out.println("Harga ice tea = " + harga);

//     } else if (pilihan_menu == 3) {
//         harga = 15000;
//         System.out.println("Harga bundling = " + harga);

//     } else {
//         System.out.println("Masukkan pilihan menu yang benar");
//         return;
//     }
    
//     totalHarga = harga - (harga * diskon);
//     System.out.println("Total bayar setelah diskon = " + totalHarga);
// }

// else if (member.equalsIgnoreCase("n")) {
//     if (pilihan_menu == 1) {
//         harga = 14000;
//         System.out.println("Harga ricebowl = " + harga);

//     } else if (pilihan_menu == 2) {
//         harga = 3000;
//         System.out.println("Harga ice tea = " + harga);

//     } else if (pilihan_menu == 3) {
//         harga = 15000;
//         System.out.println("Harga bundling = " + harga);

//     } else {
//         System.out.println("Masukkan pilihan menu dengan benar");
//         return;
//     }
    
//     System.out.println("Total bayar = " + harga);
// } else {
//     System.out.println(" Member tidak valid");
// }
// System.out.println("-------------------------------");
//     }

    


// import java.util.Scanner;
// public class Pemilihan2Percobaan217 {
//     public static void main(String[] args) {
//         Scanner input17 = new Scanner (System.in);
//         String member;
//         double harga, diskon, totalHarga;

//         System.out.println("-------------------------");
//         System.out.println("===== MENU KAFE JTI =====");
//         System.out.println("-------------------------");
//         System.out.println("1. Ricebowl");
//         System.out.println("2. Ice Tea");
//         System.out.println("3. Paket bunding (Ricebowl + Ice Tea)");
//         System.out.println("----------------------------------");
//         System.out.println("Masukkan angka dari menu yang dipilih = ");
//         int pilihan_menu = input17.nextInt();
//         input17.nextLine();
//         System.out.println("Apakah punya member (y/n) ? = ");
//         member = input17.nextLine();

// if (member.equals("y")) { 
//     diskon = 0.10;
//     System.out.println("Besar diskon = 10%");
//     if (pilihan_menu == 1) {
//         harga = 14000;
//         System.out.println("Harga ricebowl = " + harga);

//     } else if (pilihan_menu == 2) {
//         harga = 3000;
//         System.out.println("Harga ice tea = " + harga);

//     } else if (pilihan_menu == 3) {
//         harga = 15000;
//         System.out.println("Harga bundling = " + harga);

//     } else {
//         System.out.println("Masukkan pilihan menu yang benar");
//         return;
//     }
    
//     totalHarga = harga - (harga * diskon);
//     System.out.println("Total bayar setelah diskon = " + totalHarga);
// }

// else if (member.equals("n")) {
//     if (pilihan_menu == 1) {
//         harga = 14000;
//         System.out.println("Harga ricebowl = " + harga);

//     } else if (pilihan_menu == 2) {
//         harga = 3000;
//         System.out.println("Harga ice tea = " + harga);

//     } else if (pilihan_menu == 3) {
//         harga = 15000;
//         System.out.println("Harga bundling = " + harga);

//     } else {
//         System.out.println("Masukkan pilihan menu dengan benar");
//         return;
//     }
    
//     System.out.println("Total bayar = " + harga);
// } else {
//     System.out.println(" Member tidak valid");
// }
// System.out.println("-------------------------------");
//     }

    
// }

import java.util.Scanner;

public class Pemilihan2Percobaan217 {
    public static void main(String[] args) {
        Scanner input17 = new Scanner(System.in);
        String member, metodePembayaran;
        double harga, diskon, totalHarga, potonganQRIS = 1000;

        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket bundling (Ricebowl + Ice Tea)");
        System.out.println("----------------------------------");
        System.out.print("Masukkan pilihan menu dengan benar: ");
        int pilihan_menu = input17.nextInt();
        input17.nextLine(); 

        System.out.print("Apakah punya member (y/n)? = ");
        member = input17.nextLine();

        System.out.print("Jenis pembayaran (QRIS atau Tunai): ");
        metodePembayaran = input17.nextLine();

        if (member.equalsIgnoreCase("y")) {
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
                System.out.println("Masukkan pilihan menu yang benar");
                return;
            }

            totalHarga = harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon = " + totalHarga);

        } else if (member.equalsIgnoreCase("n")) {
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
                System.out.println("Masukkan pilihan menu yang benar");
                return;
            }

            totalHarga = harga;
            System.out.println("Total bayar = " + totalHarga);
        } else {
            System.out.println("Member tidak valid");
            return;
        }

        if (metodePembayaran.equalsIgnoreCase("QRIS")) {
            totalHarga -= potonganQRIS;
            System.out.println("Potongan QRIS sebesar Rp.1.000 diterapkan.");
        }

        System.out.println("Total yang harus dibayar: Rp." + totalHarga);
        System.out.println("-------------------------------");
    }
}


    
