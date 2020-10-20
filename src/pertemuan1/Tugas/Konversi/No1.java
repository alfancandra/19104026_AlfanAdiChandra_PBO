package pertemuan1.Tugas.Konversi;

public class No1 {
    public static void main(String[] args) {
        // Deklarasi
        Konversi kon;
        int C=50;
        int F=100;
        int K=100;
        int R=100;
        kon = new Konversi(C,F,K,R);
        kon.calculate(kon);

        // output
        System.out.println("Hasil Konversi");
        System.out.println("C ke F\t: "+kon.nomer1);
        System.out.println("F ke K\t: "+kon.nomer2);
        System.out.println("K ke R\t: "+kon.nomer3);
        System.out.println("R ke C\t: "+kon.nomer4);

    }
}
