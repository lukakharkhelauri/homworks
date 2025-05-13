import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TeacherDaoImpl {
    private final DatabaseConnectionManager dcm;
    private final String INSERT_TEACHER = "INSERT INTO teachers (first_name, last_name, subject, salary) VALUES (?, ?, ?, ?);";
    private final String FIND_ALL = "SELECT * FROM teachers;";

    public TeacherDaoImpl() {
        dcm = new DatabaseConnectionManager(
                "jdbc:postgresql://localhost:5432/school",
                "postgres",
                "admin"
        );
    }

    public void create(Teacher teacher) {
        try (Connection con = dcm.getConnection()) {
            PreparedStatement ps = con.prepareStatement(INSERT_TEACHER);
            ps.setString(1, teacher.getFirstName());
            ps.setString(2, teacher.getLastName());
            ps.setInt(3, teacher.getSubjectId());
            ps.setDouble(4, teacher.getSalary());
            ps.execute();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public List<Teacher> findAll() {
        try (Connection con = dcm.getConnection()) {
            PreparedStatement ps = con.prepareStatement(FIND_ALL);
            ResultSet rs = ps.executeQuery();

            List<Teacher> teachers = new ArrayList<>();

            while (rs.next()) {
                int id = rs.getInt("id");
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                int subjectId = rs.getInt("subject");
                double salary = rs.getDouble("salary");

                Teacher teacher = new Teacher(id, firstName, lastName, subjectId, salary);
                teachers.add(teacher);
            }
            return teachers;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return List.of();
    }
}