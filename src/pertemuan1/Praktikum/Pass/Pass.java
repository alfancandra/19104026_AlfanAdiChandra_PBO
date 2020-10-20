package pertemuan1.Praktikum.Pass;

public class Pass {
    public static void main(String[] args) {
        int nomer1,nomer2;

        TestPass passed;
        passed = new TestPass(50,100);
        nomer1 = 10;
        nomer2 = 20;

        // Passed by value
        System.out.println("Nilai sebelum passed by value");
        System.out.println("Nomor1\t: "+nomer1);
        System.out.println("Nomor2\t: "+nomer2);

        passed.calculate(nomer1,nomer2);
        System.out.println("Nilai setelah passed by value");
        System.out.println("Nomor1\t: "+nomer1);
        System.out.println("Nomor2\t: "+nomer2);

        System.out.println("Nilai sebelum passed by reference");
        System.out.println("Nomor1\t: "+passed.nomer1);
        System.out.println("Nomor2\t: "+passed.nomer2);

        passed.calculate(passed);
        System.out.println("Nilai sesudah passed by reference");
        System.out.println("Nomor1\t: "+passed.nomer1);
        System.out.println("Nomor2\t: "+passed.nomer2);
    }
}
