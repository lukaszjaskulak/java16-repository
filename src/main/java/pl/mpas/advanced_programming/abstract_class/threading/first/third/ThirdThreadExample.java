package pl.mpas.advanced_programming.abstract_class.threading.first.third;

import org.omg.PortableServer.THREAD_POLICY_ID;

public class ThirdThreadExample {
    public static void main(String[] args) {

        Runnable roar = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " ROAR!!!! " + i);
            }
        };



        Runnable createFirstDeamons = () -> {

            for (int i = 0; i < 3; i++) {
                Thread oldOne = new Thread(roar);
                oldOne.setName("Szatan Janusz " + i);
                oldOne.setDaemon(true);
                oldOne.start();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable createRestDeamons = () -> {
            for (int i = 0; i < 3; i++) {
                Thread newOne = new Thread(roar);
                newOne.setName("DEMON Andrzej" + i);
                newOne.setDaemon(true);
                newOne.start();
            }

            };


       Thread janusz = new Thread(createFirstDeamons);
       janusz.setPriority(Thread.MAX_PRIORITY);
       janusz.start();
       Thread andrzej = new Thread(createRestDeamons);
       andrzej.setPriority(Thread.MIN_PRIORITY);
       andrzej.start();





    }
}
