package pertemuan2.Tugas.no3;

public class Main {
    public static void main(String[] args) {
        // Deklarasi
        Mahasiswa m1 = new Mahasiswa("Kanna", "Pacaran", 3);
        Mahasiswa m2 = new Pacar("Alfan", m1.status, 3, m1.nama, "2 Tahun");

        // Cetak Superclass
        System.out.println("======Superclass======");
        m1.getStatus();
        System.out.println();

        // Cetak Subclass
        System.out.println("======Subclass======");
        m2.getStatus();
        System.out.println();
    }
}
