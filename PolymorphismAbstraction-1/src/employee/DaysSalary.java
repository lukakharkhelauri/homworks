package employee;

public class DaysSalary extends Employee{
    private int daysWorked;
    private double salaryPerDay;

    public DaysSalary(String firstName, String secondName, int phoneNumber, int daysWorked, double salaryPerDay) {
        super(firstName, secondName, phoneNumber);
        this.daysWorked = daysWorked;
        this.salaryPerDay = salaryPerDay;
    }

    public double calculateSalaryPerDay() {
        return salaryPerDay * daysWorked;
    }
}
