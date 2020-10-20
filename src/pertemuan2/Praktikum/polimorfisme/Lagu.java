package pertemuan2.Praktikum.polimorfisme;

public class Lagu {
    // Deklarasi
    public String judul;
    public String pencipta;

    //Overloading
    public Lagu(String judul) {
        this.judul = judul;
    }

    //Overloading
    public Lagu(String judul, String pencipta) {
        this.judul = judul;
        this.pencipta = pencipta;
    }

    // Method getDataLagu
    public void getDataLagu() {
        System.out.println("Judul\t\t: " + judul);
        System.out.println("Pencipta\t: " + pencipta);

    }
}
