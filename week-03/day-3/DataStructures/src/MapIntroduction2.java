import java.util.HashMap;
import java.util.Map;

public class MapIntroduction2 {
    public static void main(String[] args){

        HashMap<String,String> myMap = new HashMap<>();

        myMap.put("978-1-60309-452-8", "A Letter to Jo");
        myMap.put("978-1-60309-459-7", "Lupus");
        myMap.put("978-1-60309-444-3", "Red Panda and Moon Bear");
        myMap.put("978-1-60309-461-0", "The Lab");

        for (Map.Entry entry : myMap.entrySet() )
        {
            System.out.println(entry.getValue()+" (ISBN: "+entry.getKey()+")");
        }
        System.out.println();

        myMap.remove("978-1-60309-444-3");
        //System.out.println(myMap);

        myMap.put("978-1-60309-450-4", "They Called Us Enemy");
        myMap.put("978-1-60309-453-5", "Why Did We Trust Him?");

        /*
        for (Map.Entry entry : myMap.entrySet() )
        {
            System.out.println(entry.getValue()+" (ISBN: "+entry.getKey()+")");
        }
        */

        System.out.println(myMap.containsKey("478-0-61159-424-8"));

        System.out.println(myMap.get("978-1-60309-453-5"));

    }
}
