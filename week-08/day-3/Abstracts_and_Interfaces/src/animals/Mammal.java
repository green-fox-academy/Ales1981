package animals;

public class Mammal extends Animal{
    private boolean isHairy;

    public Mammal(String name) {
        this.name = name;
    }

    public Mammal(boolean isHairy,String name, String gender, String color, int age) {
        this.isHairy = isHairy;
        this.name = name;
        this.gender = gender;
        this.color = color;
        this.age = age;


    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String breed() {
        return "pushing miniature versions out.";
    }

    @Override
    public void eat() {
        System.out.println(this.name+" eats almost everything...");
    }

    @Override
    public void drink() {
        System.out.println(this.name+" usualy drinks water, but sometimes beer too.");
    }

}
