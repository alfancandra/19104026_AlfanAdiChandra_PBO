package pertemuan3.Praktikum.Komposisi;

public class Cpu {
    private String processor;
    private String gpu;
    private String ram;

    public Cpu(String processor, String gpu, String ram) {
        this.processor = processor;
        this.gpu = gpu;
        this.ram = ram;
    }

    public void PrintSpec(){
        System.out.println("- Prosesor\t: "+ processor);
        System.out.println("- GPU\t\t: "+ gpu);
        System.out.println("- RAM\t\t: "+ram+" GB");
        System.out.println();
    }
}
