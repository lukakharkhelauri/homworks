package employee;

public abstract class Employee {
    private String firstName;
    private String secondName;
    private int phoneNumber;

    public Employee(String firstName, String secondName, int phoneNumber) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.phoneNumber = phoneNumber;
    }
}
