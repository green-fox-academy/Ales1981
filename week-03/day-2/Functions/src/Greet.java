// - Create a string variable named `al` and assign the value `Green Fox` to it
// - Create a function called `greet` that greets it's input parameter
// - Greeting is printing e.g. `Greetings dear, Green Fox`
// - Greet `al`

public class Greet{
    public static void main(String[] args){
        String al = "Green Fox";
        greetFunction(al);
    }

    public static void greetFunction(String greet){
        System.out.println("Greetings dear,"+greet);
    }
}



