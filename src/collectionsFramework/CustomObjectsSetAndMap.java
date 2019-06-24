package collectionsFramework;

import java.util.*;

class PersonH {
    private int id;
    private String name;

    public PersonH(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "PersonH{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonH personH = (PersonH) o;
        return id == personH.id &&
                Objects.equals(name, personH.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

public class CustomObjectsSetAndMap {
    public static void main(String[] args) {

        PersonH p1 = new PersonH(0, "Bob");
        PersonH p2 = new PersonH(1, "Sue");
        PersonH p3 = new PersonH(2, "Mike");
        PersonH p4 = new PersonH(1, "Sue");

        Map<PersonH, Integer> map = new HashMap<PersonH, Integer>();

        map.put(p1, 1);
        map.put(p2, 2);
        map.put(p3, 3);
        map.put(p4, 4);

        for(PersonH key: map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        Set<PersonH> set = new HashSet<PersonH>();
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
    }
}
