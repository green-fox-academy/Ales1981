public class Swap {
    public static void main(String[] args){
        // it will swap the values of given variables
        int a = 123;
        int b = 526;
        System.out.println("before swap is executed a= "+a+" b= "+b);

        a = a + b; // 649 = 123 + 526
        b = a - b; // 123 = 649 - 526
        a = a - b; // 526 = 649 - 123

        System.out.println("after swap is executed :");
        System.out.println("a= " +a);
        System.out.println("b= " +b);


    }
}
