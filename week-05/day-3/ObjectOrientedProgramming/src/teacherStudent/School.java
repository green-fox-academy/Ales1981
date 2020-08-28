package teacherStudent;

public class School {
    public static void main(String[] args){
        Student student = new Student("Pavel");
        Teacher teacher = new Teacher("pan Novak");

        teacher.teach(student);
        student.question(teacher);







    }


}
