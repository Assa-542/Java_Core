public class Employee {
    private String name;
    private int year, month, day;
    private double salary;

    public Employee(String name, int year, int month, int day, double salary) {
        this.name = name;
        this.year = year;
        this.month = month;
        this.day = day;
        this.salary = salary;
    }


    public int compareDates(Employee other) {
        int thisDate = this.year * 10000 + this.month * 100 + this.day;
        int otherDate = other.year * 10000 + other.month * 100 + other.day;

        return Integer.compare(thisDate, otherDate);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary + '}';
    }
}
