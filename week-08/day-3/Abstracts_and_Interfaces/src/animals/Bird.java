package animals;

public class Bird extends Animal {
    private boolean isAquatic;
    private boolean isFlying;

    public Bird(String name){
        this.name = name;
    }

    public Bird(boolean isAquatic, boolean isFlying,String name, String color,String gender, int age) {
        this.isAquatic = isAquatic;
        this.isFlying = isFlying;
        this.name = name;
        this.color = color;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String breed() {
        return "laying eggs.";

    }

    @Override
    public void eat() {
        System.out.println(this.name+" mostly likes to peck.");
    }

    @Override
    public void drink() {
        System.out.println(this.name+" drinks water just like reptile.");
    }

    public void moveWings(){
        if (isFlying){
            System.out.println(this.name+" can fly");
        }else {
            System.out.println(this.name+" can not fly");
        }
    }

    public void likeWater(){
        if (isAquatic){
            System.out.println(this.name+" can swim too.");
        }else {
            System.out.println(this.name+" does not go to water very often.");
        }
    }
}
