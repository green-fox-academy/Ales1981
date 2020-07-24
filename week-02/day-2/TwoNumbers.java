public class TwoNumbers {
    public static void main(String[] args) {
        //program that do few mathematic operations
        //it prints only results
        int a = 13;
        int b = 22;

        double c = 13.0;
        double d = 22.0;


        int plus  = a + b; // it calculates 13 added to 22
        int minus = a - b; // it calculates 13 substructed from 22
        int multiply = b * a; // it multiplies 22 by 13
        double divide1 = c / d; // it divides 22 by 13 as a decimal fraction
        int divide = (b / a); // it divides 22 by 13 , shows only the Integer part of a result
        int reminder = b % a; // it shows the reminder only

        System.out.println(plus);
        System.out.println(minus);
        System.out.println(multiply);
        System.out.println(divide1);
        System.out.println(divide);
        System.out.println(reminder);
    }

}
