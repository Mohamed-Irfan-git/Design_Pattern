package creationl_pattern.prototype;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Irfan",22,"Developer");
        Employee copy = (Employee) employee.clone();

        System.out.println(copy);
    }
}
