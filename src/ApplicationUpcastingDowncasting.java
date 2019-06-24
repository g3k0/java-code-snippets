class MachineD {
    public void start() {
        System.out.println("oop.Machine started");
    }
}

class Camera extends MachineD {
    public void start() {
        System.out.println("Camera started");
    }

    public void snap() {
        System.out.println("Photo taken");
    }
}


public class ApplicationUpcastingDowncasting {

    public static void main(String[] args) {

        MachineD machine1 = new MachineD();
        Camera camera1 = new Camera();

        machine1.start();
        camera1.start();
        camera1.snap();

        // upcasting
        MachineD machine2 = camera1;
        machine2.start();
        // error: machine2.snap();

        // downcasting
        MachineD machine3 = new Camera();
        Camera camera2 = (Camera)machine3;
        camera2.snap();
    }

}
