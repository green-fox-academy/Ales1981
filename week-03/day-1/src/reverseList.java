import java.util.Arrays;

// - Create an array variable named `numbers`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `numbers`
// - Print the elements of the reversed `numbers`
public class reverseList {
    public static void main(String[] args){
        int[] numbers = {3,4,5,6,7};
        System.out.println("original array : "+Arrays.toString(numbers));

        for ( int i = 0 ; i< numbers.length/2 ; i++){
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - i - 1];
            numbers[numbers.length - i - 1] = temp;
        }
        System.out.println("reverse array : "+Arrays.toString(numbers));
    }
}
