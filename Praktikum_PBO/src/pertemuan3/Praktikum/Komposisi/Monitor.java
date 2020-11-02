package pertemuan3.Praktikum.Komposisi;

public class Monitor {
    private String merek;
    private String size;
    private String refreshRate;

    public Monitor(String merek, String size, String refreshRate) {
        this.merek = merek;
        this.size = size;
        this.refreshRate = refreshRate;
    }

    public void PrintSpec(){
        System.out.println("- Merek\t\t\t: "+merek);
        System.out.println("- Size\t\t\t: "+size);
        System.out.println("- Refresh Rate\t: "+refreshRate+ " Hz");
        System.out.println();
    }
}
