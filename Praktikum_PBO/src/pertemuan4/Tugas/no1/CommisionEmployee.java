package pertemuan4.Tugas.no1;

public class CommisionEmployee extends Employee {
    // Deklarasi
    public String nama;
    private int nip;
    private float totalGaji;
    private float gajiPokok;
    private float komisi;
    private float totalPenjualan;

    public CommisionEmployee(String nama, int nip, float gajiPokok, float komisi, float totalPenjualan) {
        super("Commision Employe");
        this.nama = nama;
        this.nip = nip;
        this.gajiPokok = gajiPokok;
        this.komisi = komisi;
        this.totalPenjualan = totalPenjualan;
    }

    @Override
    protected float menghitungGaji() {
        totalGaji = gajiPokok + (komisi * totalPenjualan);
        return totalGaji;
    }

    @Override
    protected String cetakData() {
        System.out.println("==========================");
        System.out.println(employee);
        System.out.println("Nama\t\t\t : "+nama);
        System.out.println("Nip\t\t\t\t : "+nip);
        System.out.println("Gaji Pokok\t\t : "+gajiPokok);
        System.out.println("Komisi\t\t\t : "+komisi);
        System.out.println("Total Penjualan\t : "+totalPenjualan);
        System.out.println();
        return "Total Gaji Rp." + this.menghitungGaji();
    }
}
