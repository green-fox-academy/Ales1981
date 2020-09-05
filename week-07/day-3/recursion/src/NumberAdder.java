public class NumberAdder {
    public static void main(String[] args){
        //Write a recursive function that takes one parameter: n and adds numbers from 1 to n.
        int n = 5;
        System.out.println(adder(n));

    }

    private static int adder(int n) {
        if(n==1){
            return 1;
        }else {
            return n+adder(n-1);
        }
    }
}
