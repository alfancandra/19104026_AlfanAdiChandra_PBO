package pertemuan2.Tugas.no3;

public class Pacar extends Mahasiswa {
    // Deklarasi
    String namaPacar, lamaHubungan;

    // Constructor Dengan Parameter
    public Pacar(String nama, String status, int semester, String namaPacar, String lamaHubungan) {
        this.nama = nama;
        this.status = status;
        this.semester = semester;
        this.namaPacar = namaPacar;
        this.lamaHubungan = lamaHubungan;
    }

    // Mencetak Data dari SubClass dari Parent Class menggunakan Virtual Method Invocation (VMI)
    @Override
    public void getStatus() {
        System.out.println("Nama: " + nama);
        System.out.println("Status: " + status);
        System.out.println("Semester: " + semester);
        System.out.println("Nama Pacar: " + namaPacar);
        System.out.println("Lama Hubungan: " + lamaHubungan);
    }
}
