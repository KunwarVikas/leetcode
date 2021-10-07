package main.com.kv.datastructures.stackandqueue.priorityblockingqueue;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

public class PriorityBlockingQueueBlockingConsumerExample {
    public static void main(String[] args) throws InterruptedException
    {
        PriorityBlockingQueue<Integer> priorityBlockingQueue = new PriorityBlockingQueue<>();
        new Thread(() ->
        {
            System.out.println("Waiting to poll ...");
            try
            {
                while(true)
                {
                    Integer poll = priorityBlockingQueue.take();
                    System.out.println("Polled Item : " + poll);
                    Thread.sleep(TimeUnit.SECONDS.toMillis(1));
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        Thread.sleep(TimeUnit.SECONDS.toMillis(2));
        priorityBlockingQueue.add(1);

        Thread.sleep(TimeUnit.SECONDS.toMillis(2));
        priorityBlockingQueue.add(2);

        Thread.sleep(TimeUnit.SECONDS.toMillis(2));
        priorityBlockingQueue.add(3);
    }
}