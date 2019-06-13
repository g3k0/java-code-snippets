import java.util.ArrayList;
import java.util.HashMap;

class Animal {

}

public class ApplicationGenerics {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        ////////////////// before java 5 //////////////////
        list.add("apple");
        list.add("banana");
        list.add("orange");

        String fruit = (String)list.get(1);

        System.out.println(fruit);

        ///////////////// now ///////////////////////////
        ArrayList<String> strings = new ArrayList<String>();

        strings.add("cat");
        strings.add("dog");
        strings.add("alligator");

        String animal = strings.get(1);
        System.out.println(animal);

        /////// more than one type argument ////////////
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        ////////////// Java 7 style ////////////////////
        ArrayList<Animal> someList = new ArrayList<>();
    }
}
