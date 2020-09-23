import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {
    public static void main(String[] args) {
        // Create a method that decrypts reversed-lines.txt
        Path file = Paths.get("reversed-lines.txt");
        Path fileReversed = Paths.get("reversed-lines-OK.txt");
        deReverseFunction(file, fileReversed);
    }

    private static void deReverseFunction(Path file, Path fileReversed) {
        try {
            List<String> lines = Files.readAllLines(file);
            List<String> linesToWrite = new ArrayList<>();
            for (String line : lines) {
                String toWrite = "";
                char[] charsInLine = line.toCharArray();
                for (int i = charsInLine.length - 1; i >= 0; i--) {
                    toWrite += charsInLine[i];
                }
                linesToWrite.add(toWrite);
            }
            Files.write(fileReversed, linesToWrite);
        } catch (java.io.IOException exception) {
            throw new RuntimeException("File does not exist!");
        }
    }
}
