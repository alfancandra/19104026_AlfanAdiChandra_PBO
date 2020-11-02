package pertemuan3.Praktikum.Komposisi;

public class Mouse {
    private String merek;
    private String dpi;

    public Mouse(String merek, String dpi) {
        this.merek = merek;
        this.dpi = dpi;
    }

    public void PrintSpec(){
        System.out.println("- Merek\t: "+merek);
        System.out.println("- Dpi\t: "+dpi);
        System.out.println();
    }
}
