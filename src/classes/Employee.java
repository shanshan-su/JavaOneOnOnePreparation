package classes;

public class Employee extends Person {
    private double salary;

    public Employee(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Employee(String firstName, String lastName, double salary) {
        super(firstName, lastName);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void doWork() {
        System.out.println("Work, work...");
    }



}
