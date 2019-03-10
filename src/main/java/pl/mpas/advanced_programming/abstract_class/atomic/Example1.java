package pl.mpas.advanced_programming.abstract_class.atomic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Example1 {
    public static void main(String[] args) {

        AtomicInteger counter1 = new AtomicInteger(0);
        AtomicInteger counter2 = new AtomicInteger();
        ExecutorService atomicWorkers = Executors.newFixedThreadPool(3);

        Runnable incrementingJob = () -> {
            for (int i = 0; i < 100; i++) {

               int tmp = counter1.incrementAndGet();
                System.out.println("Run by " + Thread.currentThread().getName() + " counter1  value: "  + tmp );
            }};


            atomicWorkers.execute(incrementingJob);
            atomicWorkers.execute(incrementingJob);
            atomicWorkers.execute(incrementingJob);
            atomicWorkers.shutdown();


        boolean done = false;
        try {
           done = atomicWorkers.awaitTermination(2, TimeUnit.SECONDS);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\ncounter1 final value: " + counter1 +"\n");

    }
}
