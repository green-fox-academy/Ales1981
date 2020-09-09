import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Guess the number from 0 to 9.");
        int randomNum = random.nextInt(10);
        int num;
        do {
            num = readNumber();
            if (num > randomNum) {
                System.out.println("no, it is smaller.");
            }
            if ( num < randomNum){
                System.out.println("no, it is bigger.");
            }
        }while (num != randomNum);
        System.out.println("correct it is: "+num);
    }

    private static int readNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("write your guess: ");
        int guess = scanner.nextInt();
        return guess;
    }
}
