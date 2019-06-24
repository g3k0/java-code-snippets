package oop;

class PersonE {
    private int id;
    private String name;

    public PersonE(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "PersonE{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

public class Equals {
    public static void main(String[] args) {
        PersonE person1 = new PersonE(5, "Bob");
        PersonE person2 = new PersonE(8, "Sue");

        // false, they don't point to the same object
        System.out.println(person1 == person2);
        System.out.println(person1.equals(person2));


    }
}
