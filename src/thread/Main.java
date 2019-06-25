package thread;

import concurrency.GetSitePage;
import concurrency.GetSitePageExecutor;
import concurrency.GetSitePageForkJoin;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();

        /*try {
            m.concurrencyExampleWithThread();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        /*try {
            m.concurrencyExampleWithExecutor();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }*/
        m.concurrencyExampleWithForkJoin();
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

    private void concurrencyExampleWithExecutor() throws InterruptedException, ExecutionException {
        List<Callable<String>> sites = new ArrayList<Callable<String>>();
        sites.add(new GetSitePageExecutor("http://www.christianpalazzo.org"));
        sites.add(new GetSitePageExecutor("http://www.google.it"));

        ExecutorService ex = Executors.newSingleThreadExecutor();

        List<Future<String>> out = ex.invokeAll(sites);

        for(Future<String> future: out) {
            System.out.println(future.get());
        }

        ex.shutdown();
    }

    private void concurrencyExampleWithForkJoin() {
        ForkJoinPool f = new ForkJoinPool();
        System.out.println(f.invoke(new GetSitePageForkJoin("http://www.christianpalazzo.org")));
        System.out.println(f.invoke(new GetSitePageForkJoin("http://www.google.it")));

        f.shutdown();
    }
}
