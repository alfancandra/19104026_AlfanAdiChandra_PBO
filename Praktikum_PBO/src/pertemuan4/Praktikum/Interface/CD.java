package pertemuan4.Praktikum.Interface;

public class CD {
    String ukuranCD;
    long hargaCD;

    public CD(String ukuranCD, long hargaCD) {
        this.ukuranCD = ukuranCD;
        this.hargaCD = hargaCD;
    }

    public long getHargaCD(){
        return hargaCD;
    }

    public void cetakCD(){
        System.out.println("Ukuran CD\t: "+ukuranCD);
        System.out.println("Harga CD\t: "+hargaCD);
        System.out.println("");
    }
}
