import java.util.Scanner;
public class MileToKmConverter {
    public static void main(String[] args){
        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter number of miles:");
        double distanceInMiles = scanner.nextDouble();
        double distanceInKm = distanceInMiles * 1.6;
        System.out.println("it is: "+distanceInKm+"km");

    }
}
