package oop;

enum Animals {
    CAT("Fergus"),
    DOG("Fido"),
    MOUSE("Jerry");

    private String name;

    Animals(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "this animal is called " + name;
    }

}

public class Enums {

    public static void main(String[] args) {
        Animals animal = Animals.CAT;

        switch (animal) {
            case CAT:
                System.out.println("CAT");
                break;
            case DOG:
                System.out.println("DOG");
                break;
            case MOUSE:
                System.out.println("MOUSE");
                break;
            default:
                System.out.println("NOPE");
                break;
        }

        System.out.println(Animals.DOG);
        System.out.println(Animals.MOUSE.getName());
    }
}
