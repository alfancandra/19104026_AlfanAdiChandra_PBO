package pertemuan2.Tugas.no2;

public class Ikan {
    // Deklarasi
    public String nama;
    public String berenang;

    // Constructor
    public Ikan(String nama) {
        this.nama = nama;
    }

    // Cetak Nama Binatang
    public void getNama() {
        System.out.println("Binatang\t: " + nama);
        Binatang.Makan("Rumput Laku");
        Binatang.Tidur("Mata Terbuka");
    }

    // Cetak Tingkah laku
    public void berenang() {
        System.out.println("Tingkah Laku: Berenang");
    }
}
