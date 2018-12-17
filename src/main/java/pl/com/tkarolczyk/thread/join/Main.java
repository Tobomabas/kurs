package pl.com.tkarolczyk.thread.join;
public class Main {
    public static void main(String[] args) {
        System.out.println("Start main'a");
        Runnable job = () -> {
            for(int i = 0; i<100; i++){

                System.out.println(String.format("i = [%d], run bye [%s]", i, Thread.currentThread().getName()));
            }
        };
        Thread worker = new Thread(job);
//      worker.setDaemon(true);
        Thread worker2 = new Thread(job);
        Thread worker3 = new Thread(job);
        try {
            worker.join();
            worker2.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        worker.start();
        worker2.start();
        worker3.start();
        try {
                    worker3.join();
                    Thread.sleep(4555);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Koniec main'a");
    }
}
