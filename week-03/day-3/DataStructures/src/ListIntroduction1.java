import java.util.ArrayList;

public class ListIntroduction1 {
    public static void main(String[] args){

        ArrayList<String> names = new ArrayList<>();
        System.out.println(names.size()); // 0
        names.add("Wiliam");
        System.out.println(names.isEmpty()); // false
        names.add("John");
        names.add("Amanda");
        System.out.println(names.size()); // 3
        System.out.println(names.get(2)); // Amanda

        for (int i = 0; i < names.size() ; i++) {
            System.out.println(names.get(i));
        }

        for ( String i : names ) {
            System.out.printf( i +"\n"); // i will return tu this task later (1.Wiliam,2.John,3.Amanda)
        }

        names.remove(1);

        for (int i = names.size()-1; i >= 0  ; i--) {
            System.out.println(names.get(i)); // Amanda , Wiliam
        }

        names.removeAll(names); // remove all elements

        System.out.println(names.isEmpty()); // to check if is it empty ... true

    }
}
