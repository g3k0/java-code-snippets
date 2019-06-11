public class ApplicationStringBuilder {
    public static void main(String[] args) {

        // inefficient
        String info = "";

        info += "My name is Bob";
        info += " ";
        info += "I am a builder";

        System.out.println(info);

        // efficient
        StringBuilder sb = new StringBuilder("");
        sb.append("My name is Sue.");
        sb.append(" ");
        sb.append("I am a lion tamer.");

        System.out.println(sb.toString());

        StringBuilder s = new StringBuilder();
        s.append("My name is Roger")
                .append(" ")
                .append("I am a sky driver");

        System.out.println(s.toString());

        //// Formatting /////////////////////////////

        System.out.print("Here is some text.\t That was a tab.\n");
        System.out.println(" More text");

        System.out.printf("Total cost %d\n", 5);

        // formatting integers
        System.out.printf("Total cost %-10d; quantity is %d\n", 5, 120);

        // formatting floating point value
        System.out.printf("Total value: %.2f\n", 5.6874);
    }
}
