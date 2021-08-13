import classes.Employee;
import classes.Manager;

public class SeeResult {

    // inheritance
    public static void main(String[] args) {
        Employee employee = new Employee("Shanshan", "Su");
        Manager manager1 = new Manager("Manager", "Hero");
        Employee manager2 = new Manager("Mr.", "Manager");

        employee.welcome();  // polymorphism
        employee.doWork();

        manager1.welcome();  // polymorphism
        manager1.doWork();   // inheritance
    }
}
