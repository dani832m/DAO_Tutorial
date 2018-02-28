import java.util.ArrayList;
import java.util.List;

public class StudentDaoImp implements StudentDao {

    //Listen virker som en database
    List<Student> studenter;

    public StudentDaoImp() {
        studenter = new ArrayList<Student>();
        Student student1 = new Student("Mathias", 1);
        Student student2 = new Student("Peter", 1);
        studenter.add(student1);
        studenter.add(student2);
    }

    @Override
    public void sletStudent(Student student) {
        studenter.remove(student.getAargang());
        System.out.println("Student: Årgang " + student.getAargang() + ", blev slettet fra databasen.");
    }

    //Henter liste over alle studenter
    @Override
    public List<Student> getAlleStudenter() {
        return studenter;
    }

    @Override
    public Student getStudent(int aargang) {
        return studenter.get(aargang);
    }

    @Override
    public void opdaterStudent(Student student) {
        studenter.get(student.getAargang()).setNavn(student.getNavn());
        System.out.println("Student: Årgang " + student.getAargang() + ", blev opdateret i databasen.");
    }

}
