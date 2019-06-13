class RobotA {
    private int id;

    private class Brain {
        public void think() {
            System.out.println("Robot " + id + " is thinking");
        }
    }

    // I can't access to outer class properties here
    static class Battery {
        public void charge() {
            System.out.println("Battery charging...");
        }
    }

    public RobotA(int id) {
        this.id = id;
    }

    public void start() {
        System.out.println("Started robot...");
        Brain brain = new Brain();
        brain.think();
    }
}

public class ApplicationInnerClasses {
    public static void main(String[] args) {
        RobotA robot = new RobotA(7);
        robot.start();

        RobotA.Battery battery = new RobotA.Battery();
        battery.charge();
    }
}
