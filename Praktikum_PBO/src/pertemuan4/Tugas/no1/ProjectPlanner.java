package pertemuan4.Tugas.no1;

public class ProjectPlanner extends Employee {
    // Deklarasi
    public String nama;
    private int nip;
    private float gajiPokok;
    private float komisi;
    private float totalProyek;

    public ProjectPlanner(String nama, int nip, float gajiPokok, float komisi, float totalProyek) {
        super("Projek Planner");
        this.nama = nama;
        this.nip = nip;
        this.gajiPokok = gajiPokok;
        this.komisi = komisi;
        this.totalProyek = totalProyek;
    }

    @Override
    protected float menghitungGaji() {
        float pajak = (5/100) * gajiPokok;
        float totalGaji = gajiPokok + (komisi * totalProyek) - pajak;
        return totalGaji;
    }

    @Override
    protected String cetakData() {
        System.out.println("==========================");
        System.out.println(employee);
        System.out.println("Nama\t\t : "+nama);
        System.out.println("Nip\t\t\t : "+nip);
        System.out.println("Gaji Pokok\t : "+gajiPokok);
        System.out.println("Total Proyek : "+totalProyek);
        System.out.println();
        return "Total Gaji Rp." + this.menghitungGaji()+ " Dipotong pajak 5% dari Gaji Pokok ";
    }
}
