package thread;

public class RunnableExample implements Runnable{
    @Override
    public void run() {
        System.out.println("I am a runnable thread");
    }
}
