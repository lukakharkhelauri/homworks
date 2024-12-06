public class Student {
    String firstName;
    String lastName;
    int age;
    int course;
    double avgPoints;

    Student(String firstName, String lastName, int age, int course, double avgPoints) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.course = course;
        this.avgPoints = avgPoints;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }


    public double getAveragePoints() {
        return avgPoints;
    }


    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("age cant be negative");
        }
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setAvgPoints(double avgPoints) {
        if (avgPoints >= 0 && avgPoints <= 100) {
            this.avgPoints = avgPoints;
        } else {
            System.out.println("grade should be between 0 and 100.");
        }
    }

    void printInfo() {
        System.out.println("Student: {");
        System.out.println("\tFirst name: " + firstName);
        System.out.println("\tlast name: " + lastName);
        System.out.println("\tAge: " + age);
        System.out.println("\tCourse: " + course);
        System.out.println("\tAvarage points: " + avgPoints);
        System.out.println(")");
    }
}
