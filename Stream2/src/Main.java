import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    static List<Employee> employeeList = new ArrayList<>();

    public static void main(String[] args) {

        EmployeeFactory employeeFactory = new EmployeeFactory();
        employeeList = employeeFactory.getAllEmployee();

        //1)
        System.out.println("Employees whose name starts with 'A':");
        employeeList.stream()
                .filter(employee -> employee.getFirstName().startsWith("A"))
                .forEach(employee -> System.out.println(employee.getFirstName() + " " + employee.getLastName()));

        //2)
        List<Employee> employeesJoinedIn2023 = employeeList.stream()
                .filter(emp -> emp.getId().startsWith("2023"))
                .collect(Collectors.toList());

        System.out.println("Employees who joined in 2023:");
        employeesJoinedIn2023.forEach(emp -> System.out.println(emp.getFirstName() + " " + emp.getLastName()));

        //3)
        employeeList.sort((e1, e2) -> {
            int nameComparison = e1.getFirstName().compareTo(e2.getFirstName());
            return (nameComparison != 0) ? nameComparison : Integer.compare(e1.getSalary(), e2.getSalary());
        });

        System.out.println("Sorted employees by first name and then salary:");
        employeeList.forEach(emp -> System.out.println(emp.getFirstName() + " " + emp.getLastName() + " - " + emp.getSalary()));

    }
}