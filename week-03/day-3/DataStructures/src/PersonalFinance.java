import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonalFinance {
    public static void main(String[] args){
        /*
        We are going to represent our expenses in a list containing integers.

        Create a list with the following items.
            500, 1000, 1250, 175, 800 and 120
        Create an application which solves the following problems.
            How much did we spend?
            Which was our greatest expense?
            Which was our cheapest spending?
            What was the average amount of our spendings?
         */
        Integer[] items = { 500, 1000, 1250, 175, 800, 120 };
        List<Integer>myItems=new ArrayList<>(Arrays.asList(items));
        System.out.println(myItems);

        spend(myItems); // How much did we spend?
        greatestExpense(myItems);// Which was our greatest expense?
        cheapestSpending(myItems); // Which was our cheapest spending?
        averageSpending(myItems,spend(myItems)); // What was the average amount of our spendings?

    }

    private static void averageSpending(List<Integer> myItems, int spend) {
        int average = spend / myItems.size();
        System.out.println("and the average spending is "+average);
    }


    private static void cheapestSpending(List<Integer> myItems) {
        int min = myItems.get(0);
        for (int i = 0 ; i < myItems.size() ; i++){
            if ( min > myItems.get(i)){
                min = myItems.get(i);
            }
        }
        System.out.println("Cheapest spending is "+min);
    }

    private static void greatestExpense(List<Integer> myItems) {
        int max = myItems.get(0);
        for (int i = 0 ; i < myItems.size() ; i++){
            if ( max < myItems.get(i)){
                max = myItems.get(i);
            }
        }
        System.out.println("Greatest expense is "+max);
    }

    private static int spend(List<Integer> myItems) {
        int sum = 0;
        for (int i = 0; i < myItems.size() ; i++) {
            sum += myItems.get(i);
        }
        System.out.println("We spent :"+sum);
        return sum;
    }
}
