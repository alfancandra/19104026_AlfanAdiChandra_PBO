package pertemuan4.Tugas.no1;

public abstract class Employee {
    public String employee;

    public Employee(String employee) {
        this.employee = employee;
    }

    protected abstract float menghitungGaji();

    protected abstract String cetakData();

}
