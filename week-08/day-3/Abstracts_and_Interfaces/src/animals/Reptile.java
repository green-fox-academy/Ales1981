package animals;

public class Reptile extends Animal {
    private boolean isPoisonous;

    public Reptile(String name){
        this.name = name;
    }

    public Reptile(boolean isPoisonous,String name, String gender, String color, int age) {
        this.isPoisonous = isPoisonous;
        this.name = name;
        this.gender = gender;
        this.color = color;
        this.age = age;
    }

    @Override
    public String  getName() {
        return this.name;
    }

    @Override
    public String breed() {
        return "laying eggs.";

    }

    @Override
    public void eat() {
        System.out.println(this.name+" swallows whole animal without biting");
    }

    @Override
    public void drink() {
        System.out.println(this.name+" drinks water, which doesn't have to be necessary clean...");
    }

    public void isPoisonous(){
        if (isPoisonous){
            System.out.println(this.name+" has poison,beware!");
        }else{
            System.out.println(this.name+" will not posion you");
        }
    }
}
