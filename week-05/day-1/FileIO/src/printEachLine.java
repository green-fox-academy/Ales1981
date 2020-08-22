import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class printEachLine {
    public static void main(String[] args) throws IOException {
        // Write a program that opens a file called "my-file.txt", then prints
        // each line from the file.
        // If the program is unable to read the file (for example it does not exist),
        // then it should print the following error message: "Unable to read file: my-file.txt"
        try {
            Path path = Paths.get("file.txt");
            List<String> lines = Files.readAllLines(path);
            System.out.println(lines.get(0));
        }catch (IOException e){
            System.out.println("Could not read the file!");
        }


    }
}
