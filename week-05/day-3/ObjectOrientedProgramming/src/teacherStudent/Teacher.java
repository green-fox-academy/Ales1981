package teacherStudent;

public class Teacher {
    String name;

    Teacher(String name){
        this.name=name;
    }


    public void teach(Student student) {
        student.learn();
    }

    public void answer() {
        System.out.println("Listen carefully, i will repeat it again.");
    }
}
