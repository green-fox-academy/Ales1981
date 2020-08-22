import java.util.Scanner;

public class divideByZero {
    public static void main(String[] args){
        // Create a function that takes a number
        // divides ten with it,
        // and prints the result.
        // It should print "fail" if the parameter is 0

        System.out.println("Write number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        try {
            int divide = 10 / number;
            System.out.println("10 divided by "+number+" is : "+divide);
        }catch (ArithmeticException e){
            System.out.println("Sorry, but you can not divide by 0 !");
        }
    }
}
