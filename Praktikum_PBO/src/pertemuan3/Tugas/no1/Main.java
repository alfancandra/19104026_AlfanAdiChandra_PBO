package pertemuan3.Tugas.no1;

public class Main {
    public static void main(String[] args) {
        // Deklarasi Rumah
        Rumah rumah1 = new Rumah("71", "Amber", 2);
        Rumah rumah2 = new Rumah("82", "Barbara", 3);
        Rumah rumah3 = new Rumah("93", "Beidou", 3);
        Rumah rumah4 = new Rumah("104", "Bennet", 4);

        // Deklarasi Komplek
        Komplek komplek1 = new Komplek("C", "Berkah");

        // Tambah Rumah pada Komplek1
        komplek1.addRumah(rumah1.getIdRumah());
        komplek1.addRumah(rumah2.getIdRumah());
        komplek1.addRumah(rumah3.getIdRumah());
        komplek1.addRumah(rumah4.getIdRumah());

        // Cetak
        komplek1.getDataKomplek();
    }
}
