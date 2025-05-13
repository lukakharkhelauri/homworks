import java.util.List;

public interface StudentDAO {
    void create(Student student);
    List<Student> findAll();
    Student findById(int id);
    void update(Student student);
    void delete(int id);
}
