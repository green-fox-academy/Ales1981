import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class shoppingList {
    public static void main(String[] args){
        /*
        We are going to represent a shopping list in a list containing strings.

                Create a list with the following items.
        Eggs, milk, fish, apples, bread and chicken
        Create an application which solves the following problems.
        Do we have milk on the list?
                Do we have bananas on the list?

         */
        String[] food = {"Eggs", "milk", "fish", "apples", "bread","chicken"};
        List<String> foodList = new ArrayList<>(Arrays.asList(food));
        //System.out.println(foodList);

        checkFoodList(foodList);
    }

    private static void checkFoodList(List<String> foodList) {
        System.out.println("which food do you want to check?");
        Scanner scanner = new Scanner(System.in);
        String toCheck = scanner.nextLine();
        if (foodList.contains(toCheck)){
            System.out.println("yes, "+toCheck+" are/is on the list.");
        }
        else {
            System.out.println("no, "+toCheck+" are/is not on the list.");
        }

    }
}
