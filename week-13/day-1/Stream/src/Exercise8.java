import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise8 {
    public static void main(String[] args) {
        //Write a Stream Expression to concatenate a Character list to a string!
        List<Character> characters = Arrays.asList('n', 'a', 'm', 'e');
        System.out.println(characters.stream().map(Object::toString).collect(Collectors.joining()));

    }
}
