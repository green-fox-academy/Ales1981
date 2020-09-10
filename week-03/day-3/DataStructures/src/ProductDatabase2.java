import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ProductDatabase2 {
    public static void main(String[] args) {
        HashMap<String,Integer> database = new HashMap<String,Integer>();
        database.put("Eggs", 200);
        database.put("Milk", 200);
        database.put("Fish", 400);
        database.put("Apples", 150);
        database.put("Bread", 50);
        database.put("Chicken", 550);
        System.out.println(database);
    //Which products cost less than 201? (just the name)
        int lessThan = 201;
        for (Map.Entry<String,Integer> entry : database.entrySet() ) {
            if ( entry.getValue() < lessThan){
                System.out.println(entry.getKey());
            }
        }
        System.out.println();
    //Which products cost more than 150? (name + price)
        int moreThan = 150;
        Iterator<Map.Entry<String,Integer>> iterator = database.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> entry = iterator.next();
            if (moreThan < entry.getValue()){
                System.out.println(entry.getKey()+" : "+entry.getValue());
            }
        }
    }
}
