public class DaoPatternDemo {

    public static void main(String[] args) {
        StudentDao studentDao = new StudentDaoImp();

        //Printer alle studenter
        for (Student student : studentDao.getAlleStudenter()) {
            System.out.println("Student: [Årgang : " + student.getAargang() + ", Navn : " + student.getNavn() + " ]");
        }

        //Opdater student
        Student student = studentDao.getAlleStudenter().get(1);
        student.setNavn("Michael");
        studentDao.opdaterStudent(student);

        //Get student
        studentDao.getStudent(1);
        System.out.println("Student: [Årgang : " + student.getAargang() + ", Navn : " + student.getNavn() + " ]");
    }
}