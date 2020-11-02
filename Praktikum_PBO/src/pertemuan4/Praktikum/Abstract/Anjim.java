package pertemuan4.Praktikum.Abstract;

public class Anjim extends Binatang {
    private String nama;

    public Anjim( String nama) {
        super("Anjim");
        this.nama = nama;
    }

    @Override
    protected void suara() {
        System.out.println("Menggonggong");
    }

    @Override
    public String toString(){
        return super.toString() + " " +nama;
    }
}
