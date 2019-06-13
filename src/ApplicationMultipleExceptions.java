import java.io.IOException;
import java.text.ParseException;

class Test {
    public void run() throws IOException, ParseException {
        // throw new IOException();

        throw new ParseException("Error in command list" ,2);
    }
}

public class ApplicationMultipleExceptions {
    public static void main(String[] args)  {
        Test test = new Test();

        /*try {
            test.run();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            System.out.println("Couldn't parse command file.");
        }*/
        /*try {
            test.run();
        } catch(IOException | ParseException e) {
            e.printStackTrace();
        }*/
        try {
            test.run();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
