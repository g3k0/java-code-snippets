package thread;

public class RunnableExample implements Runnable{
    @Override
    public void run() {
        System.out.println("I am a runnable thread");

        // multi threading
        for(int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        try {
            Thread.sleep(3000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}
