import java.util.Arrays;
import java.util.Scanner;

public class Anagram2 {
    public static void main(String[] args) {
        System.out.println("Anagram tester will ask for two words and decide, if they are anagrams or not.");
        System.out.println("These two words are "
                + (IsAnagram(convertToChar(userWrites()), convertToChar(userWrites())) ? "anagrams" : "are not anagrams"));
    }

    private static String userWrites() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Write word: ");
        String word = userInput.nextLine();
        return word.replaceAll(" ", "");
    }

    private static char[] convertToChar(String str) {
        char[] ch = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.toLowerCase().charAt(i);
        }
        return ch;
    }

    private static boolean IsAnagram(char[] ch1, char[] ch2) {
        if (ch1.length != ch2.length) {
            return false;
        }
        // Sort both strings
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        // Compare sorted strings
        for (int i = 0; i < ch1.length; i++)
            if (ch1[i] != ch2[i]) {
                return false;
            }
        return true;
    }
}
