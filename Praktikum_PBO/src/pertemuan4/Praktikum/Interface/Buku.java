package pertemuan4.Praktikum.Interface;

public class Buku {
    String judul,pengarang;
    long hargaBuku;

    public Buku(String judul, String pengarang, long hargaBuku) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.hargaBuku = hargaBuku;
    }

    public void cetakBuku(){
        System.out.println("\nJudul\t: " +judul);
        System.out.println("Pengarang\t: "+pengarang);
        System.out.println("Harga Buku\t: "+hargaBuku);
        System.out.println();
    }
}
