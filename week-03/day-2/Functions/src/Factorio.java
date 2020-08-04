// - Create a function called `factorio`
//   that returns it's input's factorial
import java.util.Scanner;

public class Factorio {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("write a number that starst from 0 and i will provide it's factorial");
        int adNumber = scanner.nextInt();

        System.out.println("factorial of number "+adNumber+" is "+factorio(adNumber));
    }
    public static int factorio( int adNumber) {

        if (adNumber == 0 ) {
            return 1;
        } else {
            int result = 1;
            for (int i = adNumber; i >= 1; i--)
                result *= i ;
            return result;
        }
    }
}
