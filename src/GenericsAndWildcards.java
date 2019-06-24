import java.util.ArrayList;

class MachineG {
    @Override
    public String toString() {
        return "MachineG{}";
    }
}

class CameraG extends MachineG {
    @Override
    public String toString() {
        return "CameraG{}";
    }
}

public class GenericsAndWildcards {
    public static void main(String[] args) {

        ArrayList<MachineG> list = new ArrayList<MachineG>();

        list.add(new MachineG());
        list.add(new MachineG());

        ArrayList<CameraG> list2 = new ArrayList<CameraG>();

        list2.add(new CameraG());
        list2.add(new CameraG());

        showList(list);
        showList(list2);

    }

    public static void showList(ArrayList<?> list) {
        for(Object value: list) {
            System.out.println(value);
        }
    }
}
