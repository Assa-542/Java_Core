import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("John Doe", 2020, 5, 10, 50000, Gender.MALE);
        Employee e2 = new Employee("Jane Smith", 2019, 3, 15, 60000, Gender.FEMALE);
        Manager m1 = new Manager("Manager A", 2018, 7, 20, 80000, Gender.MALE);

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

        congratulate(employees);
    }

    public static void congratulate(Employee[] employees) {
        LocalDate today = LocalDate.now();
        int month = today.getMonthValue();
        int day = today.getDayOfMonth();

        for (Employee e : employees) {
            if (month == 1 && day == 1) {  // Новый год
                System.out.println("Happy New Year, " + e.getName() + "!");
            } else if (month == 3 && day == 8 && e.getGender() == Gender.FEMALE) {
                System.out.println("Happy Women's Day, " + e.getName() + "!");
            } else if (month == 2 && day == 23 && e.getGender() == Gender.MALE) {
                System.out.println("Happy Defender's Day, " + e.getName() + "!");
            }
        }
    }
}
