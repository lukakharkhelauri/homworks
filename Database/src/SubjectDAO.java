import java.util.List;

public interface SubjectDAO {
    void create(Subject subject);
    List<Subject> findAll();
    Subject findById(int id);
    void update(Subject subject);
    void delete(int id);
}
