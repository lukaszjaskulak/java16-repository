package pl.mpas.advanced_programming.abstract_class.threading.first.increment;

class Job implements Runnable{

   private int toIncrement = 0;
   private static int staticIncrement = 1;

   public static void incStatic(){
       for (int i = 0; i < 10000; i++) {
            synchronized (Job.class) {staticIncrement++;}
       }
   }

   @Override
    public String toString() {
        return "To Increment: " + toIncrement;
    }


    @Override
     public void run() {
            for (int i = 0; i < 10000; i++) {
                System.out.println("Increased by thread: " + Thread.currentThread().getName() + " " + toIncrement);
                synchronized (this) {toIncrement++;}
            }
    }
}

public class IncrementExample {
    public static void main(String[] args) {

        Job job = new Job();

        Thread worker1 = new Thread(job, " Janusz");
        Thread worker2 = new Thread(job, " Andrzej");
        worker1.start();
        worker2.start();

        try {
            worker1.join();
            worker2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Current job value: " + job);
    }

}
