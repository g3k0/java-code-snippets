public class ApplicationArraysOfStrings {
    public static void main(String[] args) {
        // here I am creating a reference
        String[] words = new String[3];

        // here I am allocating memory
        words[0] = "Hello";
        words[1] = "to";
        words[2] = "you";

        System.out.println(words[2]);

        String[] fruits = { "apple", "banana", "kiwi" };

        for(String fruit: fruits) {
            System.out.println(fruit);
        }
    }
}
