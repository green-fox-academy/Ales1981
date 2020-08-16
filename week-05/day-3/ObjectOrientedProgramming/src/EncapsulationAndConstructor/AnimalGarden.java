package EncapsulationAndConstructor;

public class AnimalGarden {
    public static void main(String[] args) {

        Animal dog = new Animal();
        Animal cat = new Animal();
        dog.play();
        cat.drink();

        System.out.println(dog.hunger);
        System.out.println(dog.thirst);
        System.out.println(cat.thirst);
        System.out.println(cat.hunger);

    }
}
