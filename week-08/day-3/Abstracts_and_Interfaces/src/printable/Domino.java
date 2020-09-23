package printable;

public class Domino implements Printable {
    private int sideA = 3;
    private int sideB = 2;

    @Override
    public void printAllFields() {
        System.out.println("Domino A side: " + sideA + "Domino B side: " + sideB);
    }
}
