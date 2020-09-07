package cloneable;

public class Student extends Person implements Cloneable {
    private String previousOrganization;
    private int skippedDays;

    public Student(String name, int age, String gender, String previousOrganization ){
        super(name,age, gender);
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;

    }

    public Student(){
        //super("Jane Doe",30 , "female");
        this.previousOrganization = "The School of Life";
        this.skippedDays = 0;
    }

    public void getGoal(){
        System.out.println("Be a junior software developer.");
    }

    public void introduce(){
        System.out.println("Hi, I'm "+name+", a "+age+" year(s) old "+gender+" from "+previousOrganization+
                ", who skipped "+skippedDays+" days from the course already.");
    }

    public void skipDays(int numberOfDays){
        skippedDays += numberOfDays;
    }

    public Object clone() throws
            CloneNotSupportedException
    {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Student{" +
                "previousOrganization='" + previousOrganization + '\'' +
                ", skippedDays=" + skippedDays +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    public void setPreviousOrganization(String previousOrganization) {
        this.previousOrganization = previousOrganization;
    }
}
