package classes;

public class Person {
    public String firstName;
    public String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void welcome() {
        System.out.println("Welcome, " + firstName + " " + lastName +"!");
    }
}
