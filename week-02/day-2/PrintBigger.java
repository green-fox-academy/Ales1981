import java.util.Scanner;
public class PrintBigger {
    public static void main(String[] args){
        // Write a program that asks for two numbers and prints the bigger one
        Scanner scanner = new Scanner(System.in);
        System.out.println("please, write two different number.Each number confirm by pressing Enter");
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        if ( first > second ){
            System.out.println("bigger number is: "+first);
        }
        else {
            System.out.println("bigger number is: " + second);
        }
    }
}
