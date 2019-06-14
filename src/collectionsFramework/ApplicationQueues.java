package collectionsFramework;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class ApplicationQueues {
    public static void main(String[] args) {
        Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);

        q1.add(10);
        q1.add(20);
        q1.add(30);

        System.out.println("Head of queue is: " + q1.element());

        try {
            q1.add(40);
        } catch (IllegalStateException e) {
            System.out.println("Tried to add too many items to the queue");
        }

        for (Integer value: q1) {
            System.out.println("Queue value: " + value);
        }

        Integer value = q1.remove(); // remove 10
        System.out.println(value);

        ///////////////////////////////////////////////////////
        Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(2);

        q2.offer(10);
        q2.offer(20);
        q2.offer(30);

        for (Integer value2: q2) {
            System.out.println("Queue value: " + value2);
        }

        System.out.println("Queue 2 poll: " + q2.poll());
        System.out.println("Queue 2 poll: " + q2.poll());
        System.out.println("Queue 2 poll: " + q2.poll());
    }
}
