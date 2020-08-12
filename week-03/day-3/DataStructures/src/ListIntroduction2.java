import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListIntroduction2 {
    public static void main(String[] args){
        List<String> myListA = new ArrayList<>();
        myListA.add("Apple");
        myListA.add("Avocado");
        myListA.add("Blueberries");
        myListA.add("Durian");
        myListA.add("Lychee");

        //System.out.println(myListA);

        List<String> myListB = new ArrayList<>();
        myListB.addAll(myListA);
        //System.out.println(myListB);

        System.out.println(myListA.contains("Durian")); // Print out whether List A contains Durian or not

        myListB.remove("Durian"); // Remove Durian from List B
        //System.out.println(myListB);

        myListA.add(5, "Kiwifruit "); // Add Kiwifruit to List A after the 4th element
        //System.out.println(myListA);

        if ( myListA.size() > myListB.size()) // Compare the size of List A and List B
            System.out.println("myListA is bigger");
        else System.out.println("myListB is bigger");

        System.out.println(myListA.indexOf("Avocado"));//Get the index of Avocado from List A
        System.out.println(myListB.indexOf("Durian")); // Get the index of Avocado from List B ... removed -1


        List<String> moreFruits = Arrays.asList("Passion Fruit", "Pomelo");
        myListB.addAll(moreFruits); // Add Passion Fruit and Pomelo to List B in a single statement
        //System.out.println(myListB);

        System.out.println(myListA.get(2)); // Print out the 3rd element from List A
        
    }
}
