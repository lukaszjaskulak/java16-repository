package pl.mpas.advanced_programming.abstract_class.threading.first;

public class FirstThreadExample {
    public static void main(String[] args) {

        Runnable job = () -> {

            System.out.println("Worker: " + Thread.currentThread().getName());
            System.out.println("Run Forest");
            };


        job.run();

        Thread worker = new Thread(job, "CoWorker");
        // worker.setName("Worker");
        worker.run();
        worker.start();
        // worker.start(); - IllegalThreadStateException
    }
}
