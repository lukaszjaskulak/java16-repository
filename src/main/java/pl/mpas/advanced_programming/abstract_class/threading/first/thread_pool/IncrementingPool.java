package pl.mpas.advanced_programming.abstract_class.threading.first.thread_pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class IncrementingPool {

    static private int i = 0;

    public static void main(String[] args) {



        ExecutorService workers = Executors.newFixedThreadPool(4);

        Runnable countingJob = ()-> {
           synchronized (IncrementingPool.class) {i++;}
        };

        for (int i = 0; i < 2000; i++) {

                System.out.println("Counter: " + i);
                workers.execute(countingJob);
            }
        workers.shutdown();

        boolean done = false;
        while (true) {
            try {
              done =   workers.awaitTermination(1, TimeUnit.SECONDS);
                if (done) {
                    break;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();

        }
    }
        System.out.println("Finished: " + i);
}}
