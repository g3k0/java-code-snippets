package oop;

class Thing {
    public final static int LUCKY_NUMBER = 7;

    public String name;
    public static String description;

    // there is only one count shared between instances
    // because static variable belong to the class
    public static int count = 0;

    // I use static count to assign an unique id to
    // the istances
    public int id;

    public Thing() {
        id = count;
        count++;
    }

    public void showName() {
        System.out.println("ObjectId: " + id + ", " + description +  ": " + name);
    }

    public static void showInfo() {
        System.out.println(description);
    }
}

public class AppStatic {
    public static void main(String[] args) {
        Thing.description = "I am a thing";
        Thing.showInfo();

        Thing thing1 = new Thing();
        Thing thing2 = new Thing();

        thing1.name = "Bob";
        thing2.name = "Sue";

        thing1.showName();
        thing2.showName();

        System.out.println(Thing.LUCKY_NUMBER);
        System.out.println(Thing.count);
    }
}
