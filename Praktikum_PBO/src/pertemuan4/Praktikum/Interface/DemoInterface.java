package pertemuan4.Praktikum.Interface;

public class DemoInterface {
    public static void main(String[] args) {
        Paket paket = new Paket("PBO",
                "Alfan",
                100000,
                "1 Gb",
                150000);

        paket.hitungHargaPaket();
        paket.cetakPaket();
    }
}
