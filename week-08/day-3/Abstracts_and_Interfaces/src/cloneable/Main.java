package cloneable;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        // clone() - shalow copy

        Student student = new Student("John", 20, "M","BME");

        Student johntheclone = (Student)student.clone();

        student.setPreviousOrganization("PPP");

        System.out.println(student);
        System.out.println(johntheclone);

    }
}
