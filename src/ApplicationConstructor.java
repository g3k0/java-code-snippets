import javax.crypto.Mac;

class Machine {
    private String name;
    private int code;

    public Machine() {
        System.out.println("constructor running");

        name = "Arnie";
    }

    public Machine(String name) {
        System.out.println("second constructor running");
        this.name = name;
    }

    public Machine(String name, int code) {
        System.out.println("Third constructor running");
        this.name = name;
        this.code = code;
    }
}

public class ApplicationConstructor {
    public static void main(String[] args) {
        Machine machine1 = new Machine();
        Machine machine2 = new Machine("Bertie");
        Machine machine3 = new Machine("Joe", 7);
    }
}
