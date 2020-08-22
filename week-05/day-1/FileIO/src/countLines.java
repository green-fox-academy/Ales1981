import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class countLines {
    public static void main(String[] args) throws IOException {
        // Write a function that takes a filename as string,
        // then returns the number of lines the file contains.
        // It should return zero if it can't open the file, and
        // should not raise any error.

        try {
            Path path = Paths.get("file.txt");
            long countLines = Files.lines(path).count();
            System.out.println("file has "+countLines+" lines");
        }catch (IOException e){
            System.out.println("0");
        }

    }
}
