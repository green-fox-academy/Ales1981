package dominoes;

import java.util.Comparator;

public class Domino {

    private int firstNum;
    private int secondNum;

    public Domino(int firstNum, int secondNum) {
        this.firstNum=firstNum;
        this.secondNum=secondNum;
    }

    @Override
    public String toString() {
        return "["+firstNum+","+secondNum+"]";
    }

    public int getFirstNum() {
        return firstNum;
    }

    public int getSecondNum() {
        return secondNum;
    }

    public static Comparator<Domino> firstNumComparator = new Comparator<Domino>() {
        @Override
        public int compare(Domino o1, Domino o2) {

            int dominoFirstNum1 = o1.getFirstNum();
            int dominoFirstNum2 = o2.getSecondNum();

            return dominoFirstNum1-dominoFirstNum2;
        }
    };
}
