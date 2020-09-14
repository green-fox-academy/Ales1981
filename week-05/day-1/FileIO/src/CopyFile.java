import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        // Write a function that copies the contents of a file into another
        // It should take the filenames as parameters
        // It should return a boolean that shows if the copy was successful
        String firstFile = "my-file.txt";
        String secondFile = "my-file2.txt";
        System.out.println(copyFiles(firstFile,secondFile));
    }

    private static boolean copyFiles(String firstFile, String secondFile) {
        FileReader toRead = null;
        FileWriter toWrite = null;
        try {
            toRead = new FileReader(firstFile);
            toWrite = new FileWriter(secondFile);
            int c;
            while ((c = toRead.read()) != -1) {
                toWrite.write(c);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
            return false;
        } finally {
            try {
                if (toRead != null) {
                    toRead.close();
                }
                if (toWrite != null) {
                    toWrite.close();
                }
                return true;
            } catch (IOException exception) {
                exception.printStackTrace();
                return false;
            }
        }
    }
}
