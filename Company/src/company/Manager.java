package company;

public class Manager extends Employee {

    public Manager(String name, int salary, int year, int month, int day) {
        super(name, salary, year, month, day);
    }

    public static void raiseSalary(Employee[] employees, int amount) {
        for (Employee e : employees) {
            if (!(e instanceof Manager)) {
                e.setSalary(e.getSalary() + amount);
            }
        }
    }
}
