package collectionsFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int len1 = o1.length();
        int len2 = o2.length();

        if (len1 > len2) {
            return 1;
        } else if(len1 < len2) {
            return -1;
        }
        return 0;
    }
}

public class ApplicationSortingLists {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<String>();

        animals.add("cat");
        animals.add("elephant");
        animals.add("tiger");
        animals.add("lion");
        animals.add("snake");

        Collections.sort(animals, new StringLengthComparator());

        for(String animal: animals) {
            System.out.println(animal);
        }

        List<Integer> numbers = new ArrayList<Integer>();

        numbers.add(4);
        numbers.add(1);
        numbers.add(7);
        numbers.add(2);
        numbers.add(9);

        Collections.sort(numbers);

        for(Integer number: numbers) {
            System.out.println(number);
        }



    }
}
