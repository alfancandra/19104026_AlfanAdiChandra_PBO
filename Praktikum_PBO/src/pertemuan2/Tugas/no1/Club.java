package pertemuan2.Tugas.no1;

public class Club {
    // Deklarasi
    String nama, stadion, deskripsi;
    int tahunBerdiri, juaraUcl;

    // Overloading Constructor kosong
    public Club() {
    }

    // Overloading Constructor 1 Parameter
    public Club(String nama) {
        this.nama = nama;
    }

    // Overloading Constructor 2 Parameter
    public Club(String nama, String deskripsi) {
        this.nama = nama;
        this.deskripsi = deskripsi;
    }

    // Overloading Constructor 3 Parameter
    public Club(String nama, int tahunBerdiri, String stadion) {
        this.nama = nama;
        this.tahunBerdiri = tahunBerdiri;
        this.stadion = stadion;
    }

    // Overloading Constructor 5 Parameter
    public Club(String nama, int tahunBerdiri, String stadion, int juaraUcl, String deskripsi) {
        this.nama = nama;
        this.tahunBerdiri = tahunBerdiri;
        this.stadion = stadion;
        this.juaraUcl = juaraUcl;
        this.deskripsi = deskripsi;
    }

    // Cetak Semua Data
    public void getTeam() {
        System.out.println("Nama\t\t\t: " + nama);
        System.out.println("Tahun Berdiri\t: " + tahunBerdiri);
        System.out.println("Stadion\t\t\t: " + stadion);
        System.out.println("Juara UCL\t\t: " + juaraUcl);
        System.out.println("Deskripsi\t\t: " + deskripsi);
    }

}
