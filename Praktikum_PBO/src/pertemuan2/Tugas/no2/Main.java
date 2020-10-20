package pertemuan2.Tugas.no2;

public class Main {
    public static void main(String[] args) {
        // Deklarasi
        Burung burung = new Burung("Burung Gagak");
        Ikan ikan = new Ikan("Ikan Hiu");
        Kucing kucing = new Kucing("Neko");
        System.out.println("===============");
        // Cetak Class Burung
        burung.getNama();
        burung.terbang();
        System.out.println("===============");
        // Cetak Class Ikan
        ikan.getNama();
        ikan.berenang();
        System.out.println("===============");
        // Cetak Class Kucing
        kucing.getNama();
        kucing.meong();
    }
}
