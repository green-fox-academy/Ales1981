// Write a function called `sum` that returns the sum of numbers from zero to the given parameter

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Summing {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Write any number started from 0 :");
        int givenNumber = scanner.nextInt();

        System.out.println(sumFunction(givenNumber));
    }
    public static int sumFunction(int givenNumber){
        int[] arrayGivenNumbers = IntStream.rangeClosed(0,givenNumber).toArray();
        System.out.println(Arrays.toString(arrayGivenNumbers));
        int sum = 0;
        for ( int element : arrayGivenNumbers
        ) {
            sum += element;
        }
        return sum;
    }
}
