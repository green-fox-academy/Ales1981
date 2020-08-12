import java.util.HashMap;
import java.util.Map;

public class MapIntroduction1 {
    public static void main(String[] args){

        HashMap<Integer,Character> myMap = new HashMap<Integer,Character>(); //Create an empty map where the keys are integers and the values are characters

        System.out.println(myMap.isEmpty()); // ?? true ??

        myMap.put(97,'a');
        myMap.put(98,'b');
        myMap.put(99,'c');
        myMap.put(65,'A');
        myMap.put(66,'B');
        myMap.put(67,'C');

        System.out.println(myMap.isEmpty());

        System.out.println(myMap.keySet());

        System.out.println(myMap.values());

        myMap.put(68, 'D');

        // for ( Map.Entry entry : myMap.entrySet())
        // {
        //    System.out.println(entry.getKey() + " : " +entry.getValue());
        // }
        // prints all the pairs in HashMap

        System.out.println(myMap.size()); // Print how many key-value pairs are in the map

        System.out.println(myMap.get(99)); // Print the value that is associated with key 99

        myMap.remove(97);

        System.out.println(myMap.containsKey(100)); // Print whether there is an associated value with key 100 or not

        myMap.clear(); // Remove all the key-value pairs
        //System.out.println(myMap.isEmpty());

    }
}
