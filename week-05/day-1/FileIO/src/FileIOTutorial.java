import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileIOTutorial {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        File file = new File("FileIO.iml");
        System.out.println(file.exists());  //diva se zda soubor existuje,boolen vrati false/true.a vypise vysledek.
        System.out.println(file.canRead() + " " +file.canWrite());
        //diva se zda soubor lze cist nebo psat,boolen vrati false/true.a vypise vysledek.

        try {
            Scanner anotherscanner = new Scanner(file);
            while (anotherscanner.hasNext()){ //while loop > scanuje dokud ma co cist,co skanovat
                System.out.println(anotherscanner.nextLine());// precte prvni radek souboru a vypise
            }
            scanner.close(); // ukonci scanner , umozni pristup do scaneru i ostatnim aplikacim
        } catch (IOException exception){

        }

    }
}
