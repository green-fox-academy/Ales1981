
public class Exercise6 {
    public static void main(String[] args) {
        //Write a Stream Expression to find the uppercase characters in a string!
        String someText = "AAAbbbCCC";
        someText.chars()
                .filter(Character::isUpperCase)
                .mapToObj(c -> Character.toString((char)c))
                .forEach(System.out::println);
    }
}
