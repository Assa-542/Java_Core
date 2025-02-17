package company;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("John", 50000, 2020, 5, 15);
        Employee e2 = new Employee("Jane", 60000, 2018, 3, 10);
        Manager m1 = new Manager("Alice", 80000, 2015, 7, 20);

        Employee[] employees = {e1, e2, m1};

        System.out.println("Before raise:");
        for (Employee e : employees) {
            System.out.println(e.getSalary());
        }

        Manager.raiseSalary(employees, 5000);

        System.out.println("After raise:");
        for (Employee e : employees) {
            System.out.println(e.getSalary());
        }
    }
}
