package pertemuan1.Tugas.Mahasiswa;

import java.util.Scanner;

public class No2 {
    public static void main(String[] args) {
        // Deklarasi
        String nama;
        String asal;
        String tahun;
        String jurusan;

        Mahasiswa daftar = new Mahasiswa();
        Scanner scan = new Scanner(System.in);

        // Input
        System.out.printf("Masukan Nama : ");
        nama = scan.nextLine();
        daftar.setNama(nama);
        System.out.printf("Masukan Asal : ");
        asal = scan.nextLine();
        daftar.setAsal(asal);
        System.out.printf("Masukan tahun Lahir : ");
        tahun = scan.nextLine();
        daftar.setTahun(tahun);
        System.out.printf("Masukan Pilihan jurusan : ");
        jurusan = scan.nextLine();
        daftar.setJurusan(jurusan);

        // Output
        System.out.println("=====DATA ANDA=====");
        System.out.println("Nama : "+daftar.getNama());
        System.out.println("Asal : "+daftar.getAsal());
        System.out.println("Tahun Lahir : "+daftar.getTahun());
        System.out.println("Jurusan : "+daftar.getJurusan());

    }
}
