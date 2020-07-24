public class VariableMutation {

    public static void main(String[] args){

        int a = 3;
        // make the "a" variable's value bigger by 10
        a = a + 10; // it will sum variable "a" and 10
        System.out.println("Variable a bigger by 10 = ");
        System.out.println(a);

        int b = 100;
        // make b smaller by 7
        b = b - 7; // subtration 100 - 7
        System.out.println("Variable b subtracted by 7 = ");
        System.out.println(b);

        int c = 44;
        // please double c's value
        c = c * 2; // it doubles variable c
        System.out.println("Variable c double = ");
        System.out.println(c);

        int d = 125;
        // please divide by 5 d's value
        d = d / 5; // variable d divided by 5
        System.out.println("Variable d divided by 5 = ");
        System.out.println(d);

        int e = 8;
        // please cube of e's value
        // e = e * e * e;

        double cube = Math.pow(e,3); // variable e to the (power of) 3
        System.out.println(cube);

        int f1 = 123;
        int f2 = 345;
        // tell if f1 is bigger than f2 (print as a boolean)
        boolean bigger = f1 > f2;
        System.out.println("is 123 bigger than 345 ? "+bigger);

        int g1 = 350;
        int g2 = 200;
        // tell if the double of g2 is bigger than g1 (print as a boolean)
        boolean twiceBigger = (2 * g2) > g1;
        System.out.println("is the double of g2 bigger than g1 ? "+twiceBigger);

        int h = 135798745;
        // tell if it has 11 as a divisor (print as a boolean)
        boolean isDivisableBy11 = h % 11 == 0; // if result of modulo is 0, than it is divisible
        System.out.println("is number h divisible by 11? "+ isDivisableBy11);

        int i1 = 10;
        int i2 = 3;
        // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)

        boolean higherAndSmaller = (( i1 > (i2*i2)) == ( i1 < (i2*i2*i2)));
        //boolean higher = i1 > (i2*i2);
        //boolean smaller = i1 < (i2*i2*i2);
        //boolean higherAndSmaler = higher == smaller;
        System.out.println(higherAndSmaller);





        int j = 1521;
        // tell if j is dividable by 3 or 5 (print as a boolean)
        boolean isDiviAbleBy3 = j % 3 == 0;
        boolean isDiviAbleBy5 = j % 5 == 0;
        boolean isDiviAbleBy3or5 = isDiviAbleBy3 || isDiviAbleBy5;
        System.out.println(isDiviAbleBy3or5);
    }
}
