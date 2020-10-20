package pertemuan1.Tugas.Mahasiswa;

public class Mahasiswa {
    // Deklarasi
    String nama;
    String asal;
    String tahun;
    String jurusan;

    public Mahasiswa(String nama, String asal, String tahun, String jurusan) {
        this.nama = nama;
        this.asal = asal;
        this.tahun = tahun;
        this.jurusan = jurusan;
    }

    public Mahasiswa(){

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAsal() {
        return asal;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
}
