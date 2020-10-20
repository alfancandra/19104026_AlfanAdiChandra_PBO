package pertemuan1.Tugas.Konversi;

public class Konversi {
    // Deklarasi
    double nomer1,nomer2,nomer3,nomer4;

    // Method
    public Konversi(double nomer1, double nomer2,double nomer3,double nomer4) {
        this.nomer1 = nomer1;
        this.nomer2 = nomer2;
        this.nomer3 = nomer3;
        this.nomer4 = nomer4;
    }

    void calculate(Konversi kon){
        kon.nomer1 = (kon.nomer1 * 9/5)+32;
        kon.nomer2 = (kon.nomer2 - 32)*5/9+273;
        kon.nomer3 = (kon.nomer3 - 273.15)* 0.80000;
        kon.nomer4 = (kon.nomer4 * 0.8000);
    }
}
