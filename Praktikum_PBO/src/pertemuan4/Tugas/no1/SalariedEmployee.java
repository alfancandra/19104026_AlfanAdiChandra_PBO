package pertemuan4.Tugas.no1;

public class SalariedEmployee extends Employee {
    // Deklarasi
    private String nama;
    private int nip;
    private float gaji;
    private float upahMingguan;

    public SalariedEmployee(String nama, int nip, float upahMingguan) {
        super("Salaried Employee ");
        this.nama = nama;
        this.nip = nip;
        this.upahMingguan = upahMingguan;
    }

    @Override
    protected float menghitungGaji(){
        gaji = upahMingguan;
        return gaji;
    }

    @Override
    public String cetakData() {
        System.out.println("==========================");
        System.out.println(employee);
        System.out.println("Nama\t\t\t : "+nama);
        System.out.println("Nip\t\t\t\t : "+nip);
        System.out.println("Upah Mingguan\t : "+upahMingguan);
        System.out.println("Total Gaji\t\t : "+this.menghitungGaji());
        System.out.println();
        return "Total gaji Rp." + this.menghitungGaji();
    }

}
