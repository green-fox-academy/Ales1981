import java.util.HashMap;
import java.util.Map;

import static java.util.stream.Collectors.toMap;

public class Exercise9 {
    public static void main(String[] args) {
        //Write a Stream Expression to find the frequency of characters in a given string!
        String someText = "This is a very very long sentence.";
        Map<Character, Integer> letterFrequency = new HashMap<>();
        letterFrequency = someText.chars().boxed()
                .collect(toMap(
                        //key=char
                        k -> Character.valueOf((char) k.intValue()),
                        v -> 1,             // 1 occurence
                        Integer::sum));    //counting
        System.out.println("Frequencies:\n" + letterFrequency);
    }
}
