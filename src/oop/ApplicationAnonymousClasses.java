package oop;

class MachineA {
    public void start() {
        System.out.println("Starting machine...");
    }
}

interface PlantA {
    public void grow();
}

public class ApplicationAnonymousClasses {
    public static void main(String[] args) {

        // this is a child class of machineA without name
        MachineA machine1 = new MachineA() {
            @Override public void start() {
                System.out.println("Camera starting...");
            }
        };
        machine1.start();

        // implementing interface with anonymous class.
        PlantA plant1 = new PlantA() {
            public void grow() {
                System.out.println("oop.Plant growing");
            }
        };
        plant1.grow();
    }
}
