public class SumDigits {
    public static void main(String[] args){
        //Given a non-negative integer n, return the sum of its digits recursively (without loops).
        int n = 133;
        System.out.println(sumDigits(n));
    }

    private static int sumDigits(int n) {
        if (n == ( n % 10 )){
            return n;
        }else {
            return sumDigits(n/10)+sumDigits(n%10);
        }
    }
}
