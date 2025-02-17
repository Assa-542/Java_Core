package company;

import java.util.Comparator;

public class Employee {
    private String name;
    private int salary;
    private int year, month, day;

    public Employee(String name, int salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static Comparator<Employee> compareByDate() {
        return Comparator.comparingInt((Employee e) -> e.year * 10000 + e.month * 100 + e.day);
    }
}
