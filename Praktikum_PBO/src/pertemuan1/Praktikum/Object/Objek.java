package pertemuan1.Praktikum.Object;

public class Objek {
    public static void main(String[] args) {
        //Deklarasi ojbect tanpa Parameter
        Mahasiswa mahasiswaTanpa = new Mahasiswa();

        mahasiswaTanpa.setNama("Alfan");
        mahasiswaTanpa.setNim(19104026);

        System.out.println("Mahasiswa 1 ");
        System.out.println("Nama\t: "+mahasiswaTanpa.getNama());
        System.out.println("Nim\t\t: "+mahasiswaTanpa.getNim());

        Mahasiswa mahasiswa1Param = new Mahasiswa("Adi");
        System.out.println("Mahasiswa 2 ");
        System.out.println("Nama\t: "+mahasiswa1Param.getNama());
        System.out.println("Nim\t\t: "+mahasiswa1Param.getNim());

        Mahasiswa mahasiswa = new Mahasiswa("Adi",19104040);
        System.out.println("Mahasiswa 2 ");
        System.out.println("Nama\t: "+mahasiswa.getNama());
        System.out.println("Nim\t\t: "+mahasiswa.getNim());
    }
}
