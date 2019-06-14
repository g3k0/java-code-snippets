package collectionsFramework;

import java.util.ArrayList;

public class ApplicationArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // add
        numbers.add(10);
        numbers.add(100);
        numbers.add(40);

        // retrieve
        System.out.println(numbers.get(0));

        // loop
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        // remove
        numbers.remove(numbers.size() -1);
    }
}
