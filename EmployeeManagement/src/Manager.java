public class Manager extends Employee {
    public Manager(String name, int year, int month, int day, double salary) {
        super(name, year, month, day, salary);
    }

    public static void increaseSalary(Employee[] employees, double percentage) {
        for (Employee e : employees) {
            if (!(e instanceof Manager)) {
                double newSalary = e.getSalary() * (1 + percentage / 100);
                e.setSalary(newSalary);
            }
        }
    }
}
