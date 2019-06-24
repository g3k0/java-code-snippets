package files;

import java.io.*;

public class ApplicationWriteFiles {
    public static void main(String[] args) {
        File file = new File("./assets/file_2.txt");

        try(BufferedWriter br = new BufferedWriter(new FileWriter(file))) {
            br.write("This is line 1");
            br.newLine();
            br.write("This is line 2");
            br.newLine();
            br.write("Last line");
        } catch (IOException e) {
            System.out.println("Unable to read file " + file.toString());
        }
    }
}
