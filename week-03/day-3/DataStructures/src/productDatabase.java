import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class productDatabase {
    public static void main(String[] args){
        HashMap<String,Integer>products = new HashMap<>();
        products.put("Eggs", 200);
        products.put("Milk", 200);
        products.put("Fish", 400);
        products.put("Apples", 150);
        products.put("Bread", 50);
        products.put("Chicken", 550);

        System.out.println(products.keySet());
        System.out.println(products.values());

        System.out.println("----------");
        System.out.println("Hello, i am your database-bot.");
        System.out.println("----------");
        System.out.println("Please, what do you want me to do?");
        System.out.println("----------");
        System.out.println("Press 1 - to check the price of a product");
        System.out.println("Press 2 - to check what is the most expensive product");
        System.out.println("Press 3 - to check what is the average price");
        System.out.println("Press 4 - to check which product costs less than 300");
        System.out.println("Press 5 - to check which product costs exactly 125");
        System.out.println("Press 6 - to check the cheapest product");
        System.out.println("Press 7 - to end database");
        System.out.println("----------");
        Scanner scanner = new Scanner(System.in);
        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice){
            case 1:
                productPrice(products);
                break;
            case 2:
                mostExpensive(products);
                break;
            case 3:
                average(products);
                break;
            case 4:
                less300(products);
                break;
            case 5:
                exactly125(products);
                break;
            case 6:
                cheapestProduct(products);
                break;

            case 7:
                System.out.println("database ends");
                //exit;

        }



    }

    private static void less300(HashMap<String, Integer> products) {
        Integer lessThan300 = 300;
        for (Map.Entry<String,Integer> entry : products.entrySet()){
            if ( entry.getValue() < lessThan300 ){
                System.out.println("you can buy : "+entry.getKey()+" it costs less than 300");
            }
        }
    }

    private static void exactly125(HashMap<String, Integer> products) {
        int exactPrice= 125;
        for (Map.Entry<String,Integer> entry : products.entrySet()){ // to iterate through hashmap
            if (entry.getValue()==exactPrice){
                System.out.println("you can buy "+entry.getKey()+" for "+exactPrice);
            }
        }
        System.out.println("i have have nothing for exactly 125");
    }

    private static void cheapestProduct(HashMap<String, Integer> products) {
        int minPrice=(Collections.min(products.values())); // This will return min value
        for (Map.Entry<String,Integer> entry : products.entrySet()){ // to iterate through hashmap
            if (entry.getValue()==minPrice){
                System.out.println("the cheapest is "+entry.getKey()+" for "+minPrice);
            }
        }

    }

    private static void average(HashMap<String, Integer> products) {
        Integer sum = 0;
        for (Map.Entry<String,Integer> entry  : products.entrySet() ){
            sum += entry.getValue();
        }
        System.out.println("average price is :" + (long)sum/products.size());
    }

    private static void mostExpensive(HashMap<String, Integer> products) {
        int maxPrice=(Collections.max(products.values())); // This will return max value
        for (Map.Entry<String,Integer> entry : products.entrySet()){ // to iterate through hashmap
            if (entry.getValue()==maxPrice){
                System.out.println("the most expensive is "+entry.getKey()+" for "+maxPrice);
            }
        }

    }

    private static void productPrice(HashMap<String, Integer> products) {
        System.out.println("name the product: ");
        Scanner scanner = new Scanner(System.in);
        String toCheck = scanner.nextLine();
        if ( products.containsKey(toCheck)){
            System.out.println(toCheck+" is for "+products.get(toCheck));
        }
        else {
            System.out.println(toCheck+" is not in my database...");
        }
    }
}
