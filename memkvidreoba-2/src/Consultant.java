public class Consultant {
    private String firstName;
    private String lastName;
    private int id;

    public Consultant(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public String toString() {
        return "LibraryEmployee{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", id=" + id + '}';
    }
}
