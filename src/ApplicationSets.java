import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ApplicationSets {
    public static void main(String[] args) {

        // Hash set does not retain order
        // Set<String> set1 = new HashSet<String>();

        // linked Hash Set remembers the order you addded items in
        // Set<String> set1 = new LinkedHashSet<String>();

        // tree Set sorts in natural order
        Set<String> set1 = new TreeSet<String>();


        set1.add("dog");
        set1.add("cat");
        set1.add("mouse");
        set1.add("snake");
        set1.add("bear");

        System.out.println(set1);

        //////////////////////////////////////////

        // Iteration
        for (String element: set1) {
            System.out.println(element);
        }

        // does set contain a given item
        if(set1.contains("frog")) {
            System.out.println("Contains frog");
        }

        Set<String> set2 = new TreeSet<String>();


        set2.add("dog");
        set2.add("cat");
        set2.add("giraffe");
        set2.add("frog");
        set2.add("monkey");

        //////////////// intersection ////////////////////
        Set<String> intersection = new HashSet<String>(set1);

        intersection.retainAll(set2);

        System.out.println(intersection);

        ////////////// difference ///////////////
        Set<String> difference = new HashSet<String>(set1);
        difference.removeAll(set2);

        System.out.println(difference);
    }
}
