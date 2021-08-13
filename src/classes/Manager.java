package classes;

public class Manager extends Employee {

    public Manager(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Manager(String firstName, String lastName, double salary) {
        super(firstName, lastName, salary);
    }

    // method overriding
    public void doWork() {
        System.out.println("Managing employees.");
    }
}
