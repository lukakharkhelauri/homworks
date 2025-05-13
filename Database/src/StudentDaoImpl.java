import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl {
    private final DatabaseConnectionManager dcm;
    private final String INSERT_STUDENT = "INSERT INTO students (first_name, last_name, grade) VALUES (?, ?, ?);";
    private final String FIND_ALL = "SELECT * FROM teachers;";

    public StudentDaoImpl() {
        dcm = new DatabaseConnectionManager(
                "jdbc:postgresql://localhost:5432/school",
                "postgres",
                "admin"
        );
    }

    public void create(Student student) {
        try (Connection con = dcm.getConnection()) {
            PreparedStatement ps = con.prepareStatement(INSERT_STUDENT);
            ps.setString(1, student.getFirstName());
            ps.setString(2, student.getLastName());
            ps.setInt(3, student.getGrade());
            ps.execute();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public List<Student> findAll() {
        try (Connection con = dcm.getConnection()) {
            PreparedStatement ps = con.prepareStatement(FIND_ALL);
            ResultSet rs = ps.executeQuery();

            List<Student> students = new ArrayList<>();

            while (rs.next()) {
                int id = rs.getInt("id");
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                int grade = rs.getInt("grade");

                Student student = new Student(firstName, grade, id, lastName);
                students.add(student);
            }
            return students;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return List.of();
    }
}
