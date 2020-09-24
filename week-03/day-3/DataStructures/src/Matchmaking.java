// Write a method that joins the two lists by matching one girl with one boy into a new list
// If someone has no pair, he/she should be the element of the list too
// Exepected output: "Eve", "Joe", "Ashley", "Fred"...


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Matchmaking {
    public static void main(String[] args) {
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Claire", "Kat", "Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Tom", "Todd", "Neef", "Jeff"));

        System.out.println(makePairsFunction(girls, boys));
    }

    private static ArrayList<String> makePairsFunction(ArrayList<java.lang.String> girls, ArrayList<java.lang.String> boys) {
        ArrayList<String> pairs = new ArrayList<>();
        int indexGirl = 0;
        int indexBoy = 0;
        if (girls.size() > boys.size()) {
            int pairsSize = (boys.size()) + (girls.subList(0, boys.size())).size();
            List<String> restOfGirls = girls.subList(boys.size(), girls.size());
            for (int i = 0; i < pairsSize; i++) {
                if (i % 2 == 0) {
                    pairs.add(girls.get(indexGirl));
                    indexGirl++;
                } else {
                    pairs.add(boys.get(indexBoy));
                    indexBoy++;
                }
            }
            pairs.addAll(restOfGirls);
        } else {
            int pairsSize = (girls.size()) + (boys.subList(0, girls.size())).size();
            List<String> restOfBoys = boys.subList(girls.size(), boys.size());
            for (int i = 0; i < pairsSize; i++) {
                if (i % 2 == 0) {
                    pairs.add(girls.get(indexGirl));
                    indexGirl++;
                } else {
                    pairs.add(boys.get(indexBoy));
                    indexBoy++;
                }
            }
            pairs.addAll(restOfBoys);
        }
        return pairs;
    }
}