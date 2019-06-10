import java.util.Scanner;

public class ApplicationUserInput {
    public static void main(String[] args) {

        // create scanner object
        Scanner input = new Scanner(System.in);

        // output the prompt
        System.out.println("Enter a line of text: ");

        // Wait for the user input
        String line = input.nextLine();

        // tell them what they entered
        System.out.println("You entered line: " + line);
    }
}
