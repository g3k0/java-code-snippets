package variables;

public class AppString {

    public static void main(String[] args) {

        String text = "hello";
        String blank = " ";
        String name = "Bob";
        String greeting = text + blank + name;

        System.out.println(text);
        System.out.println(greeting);

        System.out.println("hello" + " " + "Bob");
    }
}
