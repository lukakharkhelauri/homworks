package human;

public class Manager extends Employee {
    private String managerID;

    public Manager(String firstName, String lastName, int age, String managerID) {
        super(firstName, lastName, age, null); //???
        this.managerID = managerID;
    }


    public String getManagerID() {
        return managerID;
    }
}
