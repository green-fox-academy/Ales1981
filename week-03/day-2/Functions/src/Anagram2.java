import java.util.Arrays;
import java.util.Scanner;

public class Anagram2 {
    public static void main(String[] args) {
        System.out.println("Anagram tester will ask for two words and decide, if they are anagrams or not.");
        System.out.println("These two words are "
                +(IsAnagram(convertToChar(userWrites()),convertToChar(userWrites())) ? "anagrams" : "are not anagrams"));
    }
    private static String userWrites() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Write word: ");
        return userInput.next();
    }
    private static char[] convertToChar(String str1) {
        char[] ch1 = new char[str1.length()];
        for (int i = 0 ; i < str1.length() ; i++){
            ch1[i] = str1.toLowerCase().charAt(i);
        } return ch1;
    }
    private static boolean IsAnagram(char[] ch1, char[] ch2) {
        int num1 = ch1.length;
        int num2 = ch2.length;
        if (num1 != num2){
            return false;
        }
        // Sort both strings
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        // Compare sorted strings
        for (int i = 0; i < num1; i++)
            if (ch1[i] != ch2[i]){
                return false;
            }
        return true;
    }
}
