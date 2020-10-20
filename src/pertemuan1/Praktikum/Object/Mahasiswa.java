package pertemuan1.Praktikum.Object;

public class Mahasiswa {
    String nama;
    int nim;

    // Constructor
    public Mahasiswa(){

    }

    public Mahasiswa(String nama, int nim) {
        this.nim = nim;
    }

    public Mahasiswa(String nama) {
        this.nama = nama;
    }

    //Getter & Setter

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }
}
