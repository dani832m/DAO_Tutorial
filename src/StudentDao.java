import java.util.List;

public interface StudentDao {

    public List<Student> getAlleStudenter();
    public Student getStudent(int aargang);
    public void opdaterStudent(Student student);
    public void sletStudent(Student student);

}