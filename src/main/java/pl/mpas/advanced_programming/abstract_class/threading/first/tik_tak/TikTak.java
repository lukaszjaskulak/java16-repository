package pl.mpas.advanced_programming.abstract_class.threading.first.tik_tak;


class Job implements Runnable {

    private String message;


    public Job(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(message);

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class TikTak {

    public static void main(String[] args) {
        Thread one = new Thread(new Job("Tik"));
        one.start();

        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread two = new Thread(new Job("Tak"));
        two.start();
    }
}
