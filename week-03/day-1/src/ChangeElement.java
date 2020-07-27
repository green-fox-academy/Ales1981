import java.util.ArrayList;
import java.util.Arrays;

public class ChangeElement {
    public static void main(String[] args){
        // - Create an array variable named `numbers`
        //   with the following content: `[1, 2, 3, 8, 5, 6]`
        // - Change the 8 to 4
        // - Print the fourth element

        //int[] numbers = {1,2,3,8,5,6};
        // int[] anArray = new int[] {1, 2, 3, 4, 5};

        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList( 1,2,3,8,5,6 ));

        System.out.println(numbers);

        numbers.set( 3, 4);

        System.out.println(numbers);

            }
}
