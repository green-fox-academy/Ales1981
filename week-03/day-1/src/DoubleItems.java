import java.lang.reflect.Array;

public class DoubleItems {
    public static void main(String[] args){
        // - Create an array variable named `numList`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Double all the values in the array
        
        int[] numList = new int[] {3,4,5,6,7};

        System.out.println("All the values in the numList array are doubled:");

        for ( int element : numList) {
            element = element * 2;
            System.out.print(element + " | ");
        }
    }
}


