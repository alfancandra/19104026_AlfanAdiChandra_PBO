package pertemuan4.Praktikum.Abstract;

public abstract class Binatang {
    private String jenis;

    public Binatang(String jenis){
        this.jenis = jenis;
    }

    // Method
    protected abstract void suara();

    @Override
    public String toString(){
        return "Seekor " + jenis;
    }
}
