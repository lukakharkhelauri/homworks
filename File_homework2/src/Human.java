public class Human {
    private String firstName;
    private String secondName;
    private int age;

    public Human(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void walk() {
        System.out.println(firstName + " is walking.");
    }

    public void hangOut(Human friend) {
        System.out.println(this.firstName + " is hanging out with " + friend.getFirstName() + ".");
    }
}
