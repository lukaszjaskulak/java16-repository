package pl.mpas.advanced_programming.abstract_class.threading.first.second;

public class SecondThreadExample {
    public static void main(String[] args) {

        System.out.println("Somebody");
        System.out.println("Works");
        System.out.println("Here");

        Runnable job = () -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("Worker: " + Thread.currentThread().getName() + " Something "+i);
            }
        };

        Thread worker = new Thread(job, "White Worker");
        worker.setDaemon(true);
        worker.start();


        Thread worker2 = new Thread(job, "Black Worker");
        worker2.setDaemon(true);
        worker2.start();

        System.out.println("main end");
    }
}
