import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Saturn is missing from the planetList
// Insert it into the correct position
// Create a method called putSaturn() which has list parameter and returns the correct list.
// Expected output: "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"

public class SolarSystem {
    public static void main(String[] args) {
        ArrayList<String> planetList;
        planetList = new ArrayList<>(Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Uranus", "Neptune"));

        System.out.println(putSaturn(planetList));
    }

    private static ArrayList<String> putSaturn(ArrayList<String> planetList) {
        planetList.add(planetList.indexOf("Uranus"), "Saturn");
        return planetList;
    }
}
