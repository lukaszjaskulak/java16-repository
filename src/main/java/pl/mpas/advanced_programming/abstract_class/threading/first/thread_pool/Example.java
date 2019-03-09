package pl.mpas.advanced_programming.abstract_class.threading.first.thread_pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example {
    public static void main(String[] args) {

        Runnable job = () -> {
            System.out.println("Perfomed by: " + Thread.currentThread().getName());
        };

        Runnable sing = () -> {
            System.out.println("Lalalalala");
        };

        ExecutorService workers = Executors.newFixedThreadPool(4);

        for (int i = 0; i < 10; i++) {
            workers.execute(job);
            workers.execute(sing);
        }
        workers.shutdownNow();
        System.out.println("After sending...");
    }
    }
