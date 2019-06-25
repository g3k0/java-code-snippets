package thread;

import concurrency.GetSitePage;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();

        try {
            m.concurrencyExampleWithThread();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void threadExample() {
        // Through class
         ThreadExample te = new ThreadExample();
         te.start(); // invoke run method

        // through runnable interface
         Thread t = new Thread(new RunnableExample());
         t.start();
    }

    private void multiThreadExample() {
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

    private void concurrencyExampleWithThread() throws InterruptedException {
        GetSitePage s1 = new GetSitePage("http://www.christianpalazzo.org");
        GetSitePage s2 = new GetSitePage("http://www.google.it");

        s1.start();
        s2.start();

        // wait to complete
        s1.join();
        s2.join();

        System.out.println("OUTPUT CHRISTIANPALAZZO");
        System.out.println(s1.getContent());

        System.out.println("OUTPUT GOOGLE");
        System.out.println(s2.getContent());
    }
}
