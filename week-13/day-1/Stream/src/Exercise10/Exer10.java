package Exercise10;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exer10 {
    public static void main(String[] args) {
        Fox redFox = new Fox("Ready", "green", 3);
        Fox whiteFox = new Fox("Whity", "white", 2);
        Fox blackFox = new Fox("Blacky", "black", 6);
        Fox brownFox = new Fox("Teddy", "brown", 7);
        Fox oldFox = new Fox("Granny", "grey", 12);
        Fox sickFox = new Fox("Sicky", "green", 8);
        PackOfFoxes foxes = new PackOfFoxes();
        foxes.add(redFox);
        foxes.add(whiteFox);
        foxes.add(blackFox);
        foxes.add(brownFox);
        foxes.add(oldFox);
        foxes.add(sickFox);

        //Write a Stream Expression to find the foxes with green color!
        foxes.getFoxes().stream().filter(fox -> fox.getColor().equals("green")).map(Fox::getName).forEach(System.out::println);
        System.out.println();

        //Write a Stream Expression to find the foxes with green color, and age less then 5 years!
        foxes.getFoxes().stream().filter(fox -> fox.getColor().equals("green"))
                .filter(fox -> fox.getAge() < 5)
                .map(Fox::getName)
                .forEach(System.out::println);
        System.out.println();

        //Write a Stream Expression to find the frequency of foxes by color!
        Map<String, String> sortedFoxesByColor =
                foxes.getFoxes().stream()
                        .collect(Collectors.toMap(
                                Fox::getColor,
                                Fox::getName,
                                (fox1, fox2) -> fox1 + " and " + fox2));
        System.out.println(sortedFoxesByColor);
    }
}
