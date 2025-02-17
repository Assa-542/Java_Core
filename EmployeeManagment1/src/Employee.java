public class Employee {
    private String name;
    private int year, month, day;
    private double salary;
    private Gender gender;

    public Employee(String name, int year, int month, int day, double salary, Gender gender) {
        this.name = name;
        this.year = year;
        this.month = month;
        this.day = day;
        this.salary = salary;
        this.gender = gender;
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary + ", gender=" + gender + '}';
    }

    public int compareDates(Employee other) {
        int thisDate = this.year * 10000 + this.month * 100 + this.day;
        int otherDate = other.year * 10000 + other.month * 100 + other.day;
        return Integer.compare(thisDate, otherDate);
    }
}
