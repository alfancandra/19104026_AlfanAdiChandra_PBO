package pertemuan2.Praktikum.overriding;

public class DemoOverriding {
    public static void main(String[] args) {
        // Deklarasi
        X supperClass = new X();
        Y subClass = new Y();

        // Memanggil method dari supperClass dan subClass
        supperClass.getValue("Mati Listrik");
        subClass.getValue("Mati Lampu");
    }
}
