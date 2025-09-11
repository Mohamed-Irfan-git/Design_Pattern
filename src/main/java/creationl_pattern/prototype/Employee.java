package creationl_pattern.prototype;

public class Employee implements Prototype {
    private final String name;
    private final int age;
    private final String job;

    public Employee(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    private Employee(Employee employee) {
        this.name = employee.name;
        this.age = employee.age;
        this.job = employee.job;

    }

    @Override
    public Prototype clone() {
        // this keyword point to the private employee
        return new Employee(this);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}
