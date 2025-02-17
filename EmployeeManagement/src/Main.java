public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("John Doe", 2020, 5, 10, 50000);
        Employee e2 = new Employee("Jane Smith", 2019, 3, 15, 60000);
        Manager m1 = new Manager("Manager A", 2018, 7, 20, 80000);

        Employee[] employees = {e1, e2, m1};

        System.out.println("Before salary increase:");
        for (Employee e : employees) {
            System.out.println(e);
        }

        Manager.increaseSalary(employees, 10);

        System.out.println("\nAfter salary increase:");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
