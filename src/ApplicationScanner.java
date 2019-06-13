import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ApplicationScanner {
    public static void main(String[] args) throws FileNotFoundException {
        String filename = "./assets/file.txt";

        File textFile = new File(filename);

        Scanner in = new Scanner(textFile);
        while(in.hasNextLine()) {
            String line = in.nextLine();
            System.out.println(line);
        }
        in.close();
    }
}
