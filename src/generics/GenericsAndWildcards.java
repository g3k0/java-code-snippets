package generics;

import java.util.ArrayList;

class Machine {
    @Override
    public String toString() {
        return "generics.Machine{}";
    }
}

class Camera extends Machine {
    @Override
    public String toString() {
        return "generics.Camera{}";
    }
}

public class GenericsAndWildcards {
    public static void main(String[] args) {

        ArrayList<Machine> list = new ArrayList<Machine>();

        list.add(new Machine());
        list.add(new Machine());

        ArrayList<Camera> list2 = new ArrayList<Camera>();

        list2.add(new Camera());
        list2.add(new Camera());

        showList(list);
        showList(list2);

    }

    public static void showList(ArrayList<?> list) {
        for(Object value: list) {
            System.out.println(value);
        }
    }
}
