import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileIOTutorial2 {
    public static void main(String[] args){
        Path path = Paths.get("FileIO.iml");
        // path. pod teckou je seznam akci ktere lye provadet
        Files.isReadable(path);//zjisti zda je cesta k souboru/soubor citelny
        Files.isWritable(path);//zjisti zda lze do souboru psat
        Files.isDirectory(path);//zjisti zda se nejedna o slozku a ne o soubor
        // tyto tri prikazi vyse vraceji boolean true/false
        try {
            List<String> lines = Files.readAllLines(path); // precte vsechny radky ze souboru , prikaz vraci list!!
            // proto se doplnil List<String> lines...
            //Files.write(path, lines); // zapise "lines" do "path"
            // Files. pod teckou je seznam akci ktere lye provadet
            //Files.lines(path); // vraci stream of strings
            for ( String line : Files.readAllLines(path)) // precte vsechny radky ze souboru v path
                // v radku vyse lze nahradit path za 'Path path = Paths.get("FileIO.iml");'
                // radek na zacatku pod 'public stati void...' pak nemusi byt
            {
                System.out.println(line.toUpperCase()); // vypise vsechny radky jako velka pismena
            }
            Files.lines(Paths.get("FileIO.iml"))//vrati stream stringu
                .forEach(line -> System.out.println(line.toUpperCase()));
        } catch (IOException exception) {
            exception.printStackTrace();
        }


    }
}
