package thread;

public class Main {
    public static void main(String[] args) {

        // Through class
        ThreadExample te = new ThreadExample();
        te.start(); // invoke run method

        // through runnable interface
        Thread t = new Thread(new RunnableExample());
        t.start();
    }
}
