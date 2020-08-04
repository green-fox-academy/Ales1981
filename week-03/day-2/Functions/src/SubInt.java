//  Create a function that takes a number and an array of integers as a parameter
//  Returns the indices of the integers in the array of which the first number is a part of
//  Or returns an empty array if the number is not part of any of the integers in the array

//  Example:
//  System.out.println(subInt(1, new int[] {1, 11, 34, 52, 61}));
//  should print: `[0, 1, 4]`
//  System.out.println(subInt(9, new int[] {1, 11, 34, 52, 61}));
//  should print: '[]'


import javax.swing.*;
import java.util.*;

public class SubInt {
    public static void main(String[] args){
        int comparedNumber = 1;
        Integer[] comparedArray = new Integer[]{1, 11, 34, 52, 61};
        //System.out.print(Arrays.toString(comparedArray));

        System.out.println(lookForSame(comparedNumber, comparedArray));
    }
    public static int lookForSame( int comparedNumber , Integer[]comparedArray){
        //for ( int element = 0 ; element < comparedArray.length ; element++)


            if( Arrays.asList(comparedArray).contains(comparedNumber) == true )
            System.out.println("je tam");
            else
                System.out.println("neni");


        //return Arrays.asList(comparedArray).contains(comparedNumber);
        return 1;
    }
}
