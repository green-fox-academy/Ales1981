import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {
    public static void main(String[] args) {
        // Create a method that decrypts the duplicated-chars.txt
        Path file = Paths.get("duplicated-chars.txt");
        Path targetFile = Paths.get("duplicated-chars-OK.txt");
        decryptator(file,targetFile);
    }

    private static void decryptator(Path file, Path targetFile) {
        try {
            List<String> lines = Files.readAllLines(file);
            List<String> lineToWrite = new ArrayList<>();
            for (String line : lines) {
                for (int i = 0; i < line.toCharArray().length-1; i=i+2) {
                    lineToWrite.add(line.substring(i, i+1));
                }
            }
            Files.write(targetFile,lineToWrite);
        } catch (java.io.IOException exception) {
            throw new RuntimeException("File does not exist!");
        }
    }
}
