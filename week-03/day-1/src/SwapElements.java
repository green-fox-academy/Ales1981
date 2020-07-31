import java.util.Arrays;

public class SwapElements {
    public static void main(String[] args){
        // - Create an array variable named `orders`
        //   with the following content: `["first", "second", "third"]`
        // - Swap the first and the third element of `orders`

        String[] orders;
        orders = new String[] {"first", "second", "third" };
        System.out.println(Arrays.toString(orders));

        /** for ( int order = 0 ; order < orders.length ; order++){
            if ( order == 0 )
                orders[0] = orders[2];

            if ( order == 1 )
                orders[1] = orders[1];

            if ( order == 2 )
                orders[2] = orders[0];
        }
         */

        String temp = orders[0];
        orders[0] = orders[2];
        //orders[1] = orders[1];
        orders[2] = temp;

        System.out.println(Arrays.toString(orders));
    }
}
