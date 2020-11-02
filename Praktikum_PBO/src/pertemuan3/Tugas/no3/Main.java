package pertemuan3.Tugas.no3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Deklarasi
        Keluarga fam1 = new Keluarga("Uzumaki", "Konoha");
        Ayah ayah = new Ayah(1972, "Naruto", 48);
        Ibu ibu = new Ibu(1982, "Hinata", 38);
        ArrayList<Anak> anakList = new ArrayList<>();
        anakList.add(new Anak(1, "Boruto", 12, "Ninja"));
        anakList.add(new Anak(2, "Himawari", 7, "Pelajar"));
        // Tambah Keluarga
        fam1.addAnggotaKeluarga(ayah, ibu, anakList);
        // Cetak
        fam1.getDataKeluarga();
    }
}
