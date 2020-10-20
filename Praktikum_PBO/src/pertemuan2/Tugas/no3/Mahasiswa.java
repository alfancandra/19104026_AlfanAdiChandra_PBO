package pertemuan2.Tugas.no3;

public class Mahasiswa {
    // Deklarasi
    String nama, status;
    int semester;

    // Constructor
    public Mahasiswa() {
    }

    // Constructor
    public Mahasiswa(String nama, String status, int semester) {
        this.nama = nama;
        this.status = status;
        this.semester = semester;
    }

    // Cetak Data
    void getStatus() {
        System.out.println("Nama: " + nama);
        System.out.println("Status: " + status);
        System.out.println("Semester: " + semester);
    }
}
