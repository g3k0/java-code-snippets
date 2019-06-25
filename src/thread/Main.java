package thread;

public class Main {
    public static void main(String[] args) {

        // Through class
        // ThreadExample te = new ThreadExample();
        // te.start(); // invoke run method

        // through runnable interface
        // Thread t = new Thread(new RunnableExample());
        // t.start();

        ThreadExample te1 = new ThreadExample();
        te1.setName("Thread 1");

        ThreadExample te2 = new ThreadExample();
        te2.setName("Thread 2");

        ThreadExample te3 = new ThreadExample();
        te3.setName("Thread 3");

        ThreadExample te4 = new ThreadExample();
        te4.setName("Thread 4");

        ThreadExample te5 = new ThreadExample();
        te5.setName("Thread 5");

        te1.start();
        te2.start();
        te3.start();
        te4.start();
        te5.start();
    }
}
