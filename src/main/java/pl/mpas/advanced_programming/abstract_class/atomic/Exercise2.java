package pl.mpas.advanced_programming.abstract_class.atomic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;

public class Exercise2 {

   volatile static long counter = 0;
    public static void main(String[] args) {
        //3 wątki zwiekszaja zmienna typu long - 500 iteracji
        // watek zwieksza zmienna co 500ms
        // watki uzywaja synchronizacji przy zapisie
        //1 watek wypisuje bez synchronizacji - caly czas


        ExecutorService workers = Executors.newFixedThreadPool(4);

        Runnable write = () -> {
            for (int i = 0; i < 500; i++) {

                synchronized (Exercise2.class) {
                    counter++;}
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(String.format("Current value: [%10d], from thread [%s]", counter, Thread.currentThread().getName()));
            }
            };

        Runnable read = () -> {
            boolean done = true;
            while(done) {
                System.out.println("Counter: " + counter);
                if (counter==1500){
                    done = false;
                }
            }
        };

        workers.execute(read);
        workers.execute(write);
        workers.execute(write);
        workers.execute(write);
        workers.shutdown();
    }
}
