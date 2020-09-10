import java.util.*;

public class ShoppingList2 {
    public static void main(String[] args) {
        HashMap<String,Double>products = new HashMap<>();
        products.put("Milk",1.07);
        products.put("Rice",1.59);
        products.put("Eggs",3.14);
        products.put("Cheese",12.60);
        products.put("Chicken Breasts",9.40);
        products.put("Apples",2.31);
        products.put("Tomato",2.58);
        products.put("Potato",1.75);
        products.put("Onion",1.10);

        HashMap<String,Integer>bobsList = new HashMap<>();
        bobsList.put("Milk",3);
        bobsList.put("Rice",2);
        bobsList.put("Eggs",2);
        bobsList.put("Cheese",1);
        bobsList.put("Chicken Breasts",4);
        bobsList.put("Apples",1);
        bobsList.put("Tomato",2);
        bobsList.put("Potato",1);

        HashMap<String,Integer>alicesList = new HashMap<>();
        alicesList.put("Rice",1);
        alicesList.put("Eggs",5);
        alicesList.put("Chicken Breasts",2);
        alicesList.put("Apples",1);
        alicesList.put("Tomato",10);

        System.out.println("Bob payed: "+howMuchPayed(products, bobsList)
                +" and Alice payed: "+howMuchPayed(products, alicesList));


        System.out.println("Who buys more rice? Bob or Alice? "+((whoBoughtMore(bobsList, "Rice"))
                >(whoBoughtMore(alicesList,"Rice")) ? "Bob!":"Alice!"));

        System.out.println("Who buys more potato? Bob or Alice? "+((whoBoughtMore(bobsList, "Potato"))
                >(whoBoughtMore(alicesList,"Potato")) ? "Bob!":"Alice!"));

        System.out.println("Who bought more products? Bob or Alice? "+((whoseListIsBigger(bobsList))
                >(whoseListIsBigger(alicesList)) ? "Bob!":"Alice!"));

        System.out.println("Who bought more pieces? Bob or Alice? "+((whoBoughtMorePieces(bobsList))
                >(whoBoughtMorePieces(alicesList)) ? "Bob!":"Alice!"));

    }
    public static double howMuchPayed(HashMap<String,Double>someList1,HashMap<String,Integer> someList2){
        double sum = 0;
        for (Map.Entry<String,Integer> entry : someList2.entrySet()) {
            if (someList1.containsKey(entry.getKey())) {
                sum += (double)entry.getValue() * someList1.get(entry.getKey());
            }
        }return sum;
    }
    public static int whoBoughtMore(HashMap<String,Integer> someList, String item){
        int num = 0;
        if (someList.containsKey(item)){
            num = someList.get(item);
        }return num;
    }
    public static int whoseListIsBigger(HashMap<String,Integer>someList){
        return someList.size();
    }
    public static int whoBoughtMorePieces(HashMap<String,Integer>someList){
        int sum = 0;
        Iterator<Map.Entry<String,Integer>> iterator = someList.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,Integer> entry = iterator.next();
            sum += entry.getValue();
        } return sum;
    }
}

