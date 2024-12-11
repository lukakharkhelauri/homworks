package human;

public class Employee extends Human {
    private String employeeID;

    public Employee(String firstName, String lastName, int age, String employeeID) {
        super(firstName, lastName,  age);
        this.employeeID = employeeID;
    }

    public String getEmployeeID() {
        return employeeID;
    }
}
