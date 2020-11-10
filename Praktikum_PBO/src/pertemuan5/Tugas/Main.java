package pertemuan5.Tugas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Input jumlah pengunjung
        System.out.print("Jumlah pengunjung\t: ");
        int[] pengunjung = new int[intInputMethod()];

        // Set Max 10
        if(pengunjung.length <= 10) {
            System.out.println("Masukan Data Pengunjung\t: ");
            for (int i = 0; i < pengunjung.length; i++) {
                // Cek kesalahan input UID
                try {
                    System.out.print("UID : ");
                    pengunjung[i] = intInputMethod();
                    System.out.println("Data ke-"+i+"\t: "+pengunjung[i]+" terdaftar!");
                } catch (Exception e) {
                    // Jika input selain Angka
                    System.out.println("Hanya bisa input Angka");
                    i--;
                }
            }

            System.out.println("\nLihat Data Pengunjung\t: ");

            // Perulangan Lihat data
            while(true){
                System.out.printf("Indeks : ");
                int index = intInputMethod();
                // Cek kesalahan input
                try {
                    System.out.println("Data ke-" + index + "\t: " + pengunjung[index]);
                }catch (Exception e){
                    // Jika input salah
                    System.out.println("Tidak ada indeks ke-"+index);
                }
                System.out.print("Lihat lagi? (y/n)\t: ");
                String ulang = StringInputMethod();
                // Jika inputan n atau N maka exit
                if(ulang.equals("n") || ulang.equals("N")) {
                    break;
                }
            }
        }else{
            // Jika input melebihi 10
            System.out.printf("Hanya bisa input dari 1 sampai 10");
        }


    }
    // class input Int
    public static int intInputMethod(){
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        return input;
    }
    // class input String
    public static String StringInputMethod(){
        Scanner scan = new Scanner(System.in);
        String result = scan.nextLine();
        return (String) result;
    }
}
