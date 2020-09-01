package beforeInheritance;

public class Student {
    private String name;
    private int age;
    private String gender;
    private String previousOrganization; // the name of the student’s previous company / school
    private int skippedDays; // the number of days skipped from the course


    public void introduce(){
        System.out.println("Hi, I'm "+name+", a "+age+" year(s) old "+gender+" from "+previousOrganization+
                " ,who skipped "+skippedDays+" days from the course already.");
    }
    public void getGoal(){
        System.out.println("Be a junior software developer.");
    }
    public void skipDays(int numberOfDays){
        skippedDays += numberOfDays;
    }
    public Student(String name,int age, String gender,String previousOrganization){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }
    public Student(){
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
        this.previousOrganization = "The School of Life.";
        this.skippedDays = 0;
    }
}
