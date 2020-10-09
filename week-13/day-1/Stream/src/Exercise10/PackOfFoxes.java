package Exercise10;

import java.util.ArrayList;
import java.util.List;

public class PackOfFoxes {
    private List<Fox> foxes = new ArrayList<>();

    public PackOfFoxes() {
    }

    public void add(Fox fox){
        foxes.add(fox);
    }

    public List<Fox> getFoxes() {
        return foxes;
    }
}
