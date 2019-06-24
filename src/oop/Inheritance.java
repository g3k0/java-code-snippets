package oop;

class Machine {
    protected String name = "oop.Machine type 1";

    public void start() {
        System.out.println("oop.Machine started");
    }

    public void stop() {
        System.out.println("oop.Machine stopped");
    }
}

class Car extends Machine {
    public void wipeWindShield() {
        System.out.println("Wiping windshield");
    }

    // override mother class method
    @Override
    public void start() {
        System.out.println("oop.Car started");
    }

    public void showInfo() {
        System.out.println("oop.Car name: " + name);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Machine machine1 = new Machine();

        machine1.start();
        machine1.stop();

        Car car1 = new Car();
        car1.start();
        car1.wipeWindShield();
        car1.stop();

        car1.showInfo();
    }
}
