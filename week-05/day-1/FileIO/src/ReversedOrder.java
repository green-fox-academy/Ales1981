import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {
    public static void main(String[] args) {
        // Create a method that decrypts reversed-order.txt

        Path file = Paths.get("reversed-order.txt");
        Path fileRevOrder = Paths.get("reversed-order-OK.txt");
        revOrderFunc(file, fileRevOrder);
    }

    private static void revOrderFunc(Path file, Path fileRevOrder) {
        try {
            List<String> lines = Files.readAllLines(file);
            List<String> revOrder = new ArrayList<>();
            for (int i = lines.size() - 1; i >= 0; i--) {
                revOrder.add(lines.get(i));
            }
            Files.write(fileRevOrder, revOrder);

        } catch (java.io.IOException exception) {
            throw new RuntimeException("File does not exist!");
        }
    }
}
