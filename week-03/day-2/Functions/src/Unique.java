import java.util.ArrayList;
import java.util.List;

public class Unique {
    public static void main(String[] args){
        int[] numbersToCheck = {1, 11, 34, 11, 52, 61, 1, 34};
        System.out.println(unique(numbersToCheck));
    }

    private static List<Integer> unique(int[] numbersToCheck) {
        List<Integer> inList = new ArrayList<Integer>(numbersToCheck.length);
        for (int element : numbersToCheck) {
            inList.add(element);
        }
        for ( int i = 0 ; i < inList.size() ; i++){
            for (int j = i+1 ; j < inList.size() ; j++){
                if ( inList.get(i) == inList.get(j)){
                    inList.remove(j);
                }
            }
        } return inList;
    }
}
