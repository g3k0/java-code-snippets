package oop;

abstract class MachineB {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract void start();
}

class CameraB extends MachineB {
    @Override
    public void start() {

    }
}

class CarB extends MachineB {
    @Override
    public void start() {

    }
}

public class ApplicationAbstractClasses {
    public static void main(String[] args) {
        CameraB cam1 = new CameraB();
        cam1.setId(5);

        CarB car1 = new CarB();
        car1.setId(4);

    }
}
