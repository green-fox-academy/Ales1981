import animals.*;

public class ZooApp {
    public static void main(String[] args) {

        Reptile reptile = new Reptile("Crocodile");
        Mammal mammal = new Mammal("Koala");
        Bird bird = new Bird("Parrot");

        System.out.println("How do you breed?");
        System.out.println("A " + reptile.getName() + " is breeding by " + reptile.breed());
        System.out.println("A " + mammal.getName() + " is breeding by " + mammal.breed());
        System.out.println("A " + bird.getName() + " is breeding by " + bird.breed());
        System.out.println();

        mammal.drink();
        reptile.drink();
        bird.drink();
        System.out.println();

        Reptile cobra = new Reptile(true, "Cobra", "M", "black",3);
        System.out.println("A " + cobra.getName() + " is breeding by " + cobra.breed());
        cobra.isPoisonous();
        System.out.println();

        Bird eagle = new Bird(false, true, "Eagle", "black and white", "F", 2);
        eagle.moveWings();
        eagle.likeWater();

    }
}
