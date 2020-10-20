package pertemuan2.Tugas.no2;

public class Kucing {
    // Deklarasi
    public String nama;
    public String meong;

    // Constructor
    public Kucing(String nama) {
        this.nama = nama;
    }

    // Cetak Nama Binatang
    public void getNama() {
        System.out.println("Binatang\t: " + nama);
        Binatang.Makan("Whiskas");
        Binatang.Tidur("Rebahan");
    }

    // Cetak tingkah laku
    public void meong() {
        System.out.println("Tingkah Laku: Barbar");
    }
}
