import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileReadWrite {
    public static void main(String[] args) {
        String fileName = "sample.txt";

        try {
            FileWriter fw = new FileWriter(fileName);
            fw.write("Hello! This is a file write-read example.");
            fw.close();

            FileReader fr = new FileReader(fileName);
            int i;
            System.out.print("File Content: ");
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
            fr.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
