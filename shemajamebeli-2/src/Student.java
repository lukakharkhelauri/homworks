import java.util.*;

public class Student implements Serializable {
    static final long serialVersionUID = 1L;
    int id;
    String firstName;
    String secondName;
    int year;
    double avgPoints;
    List<String> subjects;

    public Student(double avgPoints, String firstName, int id, String secondName, List<String> subjects, int year) {
        this.avgPoints = avgPoints;
        this.firstName = firstName;
        this.id = id;
        this.secondName = secondName;
        this.subjects = subjects;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Student{" +
                "avgPoints=" + avgPoints +
                ", id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", year=" + year +
                ", subjects=" + subjects +
                '}';
    }
}
