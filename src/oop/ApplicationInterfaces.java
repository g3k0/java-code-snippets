package oop;

class Machinet implements Info {
    private int id = 7;

    public void start() {
        System.out.println("oop.Machinet started");
    }

    @Override
    public void showInfo() {
        System.out.println("oop.Machinet id is: " + id);
    }
}

class Persont implements Info {
    private String name;

    public Persont(String name) {
        this.name = name;
    }

    public void greet() {
        System.out.println("Hello there");
    }

    @Override
    public void showInfo() {
        System.out.println("oop.Persont name is: " + name);
    }
}

public class ApplicationInterfaces {
    public static void main(String[] args) {
        Machinet mach1 = new Machinet();
        mach1.start();

        Persont person1 = new Persont("Teo");
        person1.greet();

        // I can use interface as type:
        Info info1 = new Machinet();
        info1.showInfo();


        // I can point to object that implements the interface:
        Info info2 = person1;
        info2.showInfo();

        outputInfo(person1);
    }

    // I can pass info in method as paarameter
    private static void outputInfo(Info info) {
        info.showInfo();
    }
}
