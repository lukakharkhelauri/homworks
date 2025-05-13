import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SubjectDaoImpl {
    private final DatabaseConnectionManager dcm;
    private final String INSERT_SUBJECT = "INSERT INTO subjects (subject_name) VALUES (?);";
    private final String FIND_ALL = "SELECT * FROM subjects;";

    public SubjectDaoImpl() {
        dcm = new DatabaseConnectionManager(
                "jdbc:postgresql://localhost:5432/school",
                "postgres",
                "admin"
        );
    }

    public void create(Subject subject) {
        try (Connection con = dcm.getConnection()) {
            PreparedStatement ps = con.prepareStatement(INSERT_SUBJECT);
            ps.setString(1, subject.getSubjectName());
            ps.execute();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public List<Subject> findAll() {
        try (Connection con = dcm.getConnection()) {
            PreparedStatement ps = con.prepareStatement(FIND_ALL);
            ResultSet rs = ps.executeQuery();

            List<Subject> subjects = new ArrayList<>();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("subject_name");

                Subject subject = new Subject(id, name);
                subjects.add(subject);
            }
            return subjects;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return List.of();
    }
}
