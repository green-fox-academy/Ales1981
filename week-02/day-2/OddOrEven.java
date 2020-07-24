import java.util.Scanner;
public class OddOrEven {
    public static void main(String[] arqs){
        // Write a program that reads a number from the standard input,
        // Then prints "Odd" if the number is odd, or "Even" if it is even.
        Scanner scanner = new Scanner(System.in);
        System.out.println("please, enter a number:");
        int enteredNumber = scanner.nextInt();
        if ( enteredNumber % 2 == 0 ) {
            System.out.println("Entered number is even!");
        }
        if ( enteredNumber % 2 != 0 ){
            System.out.println("Entered number is odd!");
        }
    }
}
