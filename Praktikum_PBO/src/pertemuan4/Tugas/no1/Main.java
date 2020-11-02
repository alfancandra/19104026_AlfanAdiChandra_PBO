package pertemuan4.Tugas.no1;

public class Main {
    public static void main(String[] args) {
        // Deklarasi
        Employee employee = new SalariedEmployee("Boruto", 44, 400000);
        Employee employee1 = new CommisionEmployee("Naruto", 22, 5000000, 55, 250);
        Employee employee2 = new ProjectPlanner("Kirito", 55, 2500000, 20000, 80);

        // Cetak
        System.out.println(employee.cetakData());
        System.out.println();
        System.out.println(employee1.cetakData());
        System.out.println();
        System.out.println(employee2.cetakData());
        System.out.println();
    }
}
