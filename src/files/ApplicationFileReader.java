package files;

import java.io.*;

public class ApplicationFileReader {
    public static void main(String[] args) {

        File file = new File("./assets/file.txt");
        BufferedReader br = null;

        try {
            FileReader fr = new FileReader(file);
            br = new BufferedReader(fr);

            String line;

            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found " + file.toString());
        } catch (IOException e) {
            System.out.println("Unable to read file");
        }
        finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
