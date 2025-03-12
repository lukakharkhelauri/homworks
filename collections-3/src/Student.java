import java.util.*;

public class Student {
    private String firstName;
    private String lastName;
    private Date birthDate;
    private ArrayList<Integer> grades;

    public Student(String firstName, String lastName, Date birthDate, ArrayList<Integer> grades) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.grades = grades;
    }

    public double calculateAverageGrade() {
        return grades.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String toString() {
        return getFullName() + " - Birth Date: " + birthDate + " - Average Grade: " + calculateAverageGrade();
    }
}
