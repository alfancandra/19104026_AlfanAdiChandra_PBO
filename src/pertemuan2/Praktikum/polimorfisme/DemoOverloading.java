package pertemuan2.Praktikum.polimorfisme;

public class DemoOverloading {
    public static void main(String[] args) {
        // Deklarasi
        Lagu lagu1 = new Lagu("Gajah", "Tulus");
        Lagu lagu2 = new Lagu("Sewindu", "Tulus");

        lagu1.getDataLagu(); // Memanggil method getDatalagu
        System.out.println();
        lagu2.getDataLagu(); // Memanggil method getDatalagu
    }
}
