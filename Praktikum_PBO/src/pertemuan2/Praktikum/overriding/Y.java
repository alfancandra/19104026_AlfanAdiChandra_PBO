package pertemuan2.Praktikum.overriding;

public class Y extends X {
    // Method getValue
    public void getValue(String value) {
        super.getValue(value);
        System.out.println("Value class Y\t: " + value);
    }
}
