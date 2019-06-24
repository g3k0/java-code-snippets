package oop;

class Machinez {
    private String name;
    private int code;

    public Machinez() {
        System.out.println("constructor running");

        name = "Arnie";
    }

    public Machinez(String name) {
        System.out.println("second constructor running");
        this.name = name;
    }

    public Machinez(String name, int code) {
        System.out.println("Third constructor running");
        this.name = name;
        this.code = code;
    }
}

public class Constructor {
    public static void main(String[] args) {
        Machinez machine1 = new Machinez();
        Machinez machine2 = new Machinez("Bertie");
        Machinez machine3 = new Machinez("Joe", 7);
    }
}
