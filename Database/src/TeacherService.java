public class TeacherService {
    private final TeacherDAO teacherDao;
    private final SubjectDAO subjectDao;

    public TeacherService(TeacherDAO teacherDao, SubjectDAO subjectDao) {
        this.teacherDao = teacherDao;
        this.subjectDao = subjectDao;
    }

    public String getSubjectNameByTeacherId(int teacherId) throws Exception {
        Teacher teacher = teacherDao.findById(teacherId);
        if (teacher == null) {
            throw new Exception("Teacher not found.");
        }
        Subject subject = subjectDao.findById(teacher.getSubjectId());
        if (subject == null) {
            throw new Exception("Subject not found.");
        }
        return subject.getSubjectName();
    }
}
