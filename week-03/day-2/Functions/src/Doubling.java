// - Create an integer variable named `baseNum` and assign the value `123` to it
// - Create a function called `doubling` that doubles it's input parameter and returns with an integer
// - Print the result of `doubling(baseNum)`

public class Doubling {
    public static void main(String[] args){

        int baseNum = 123;
        //doublingFunction(baseNum);
        System.out.println(doublingFunction(baseNum));

    }
    public static int doublingFunction(int baseNum){
        int result;
        result = baseNum * 2;
        //System.out.println(result);
        return result;
    }
}


