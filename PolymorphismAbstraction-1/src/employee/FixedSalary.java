package employee;

public class FixedSalary extends Employee{
    private double fixedSalary;

    public FixedSalary(String firstName, String secondName, int phoneNumber, double fixedSalary) {
        super(firstName, secondName, phoneNumber);
        this.fixedSalary = fixedSalary;
    }

    public double getFixedSalary() {
        return fixedSalary;
    }
}
