class Dog {
    private String name;
    private int id;

    public Dog(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(id).append(": ").append(name);
        return sb.toString();
    }
}

public class ApplicationToString {
    public static void main(String[] args) {
        Dog dog1 = new Dog(7, "Bob");

        System.out.println(dog1);
    }
}
