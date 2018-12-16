package pl.com.tkarolczyk.thread;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Runnable job = () -> System.out.println("Worker name: " +Thread.currentThread().getName());
        Thread worker = new Thread(job);

        PwcWorker pwcWorker = new PwcWorker("PwcWorker", job, worker);

        //job.run();


        worker.setName("worker");
        worker.run();
        worker.start();
        pwcWorker.start();


        Thread worker2 = new Thread(job);
        try {
            worker2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        worker2.setName("beżowy");
        worker2.start();
        List<String> strings = new ArrayList<>();
        Runnable addingStrinf =  () -> {
                    synchronized (strings) {
                        strings.add(Thread.currentThread().getName());
                    }
        };
        Thread one = new Thread(addingStrinf);
        Thread two = new Thread(addingStrinf);
        Thread thee = new Thread(addingStrinf);
        Thread four = new Thread(addingStrinf);

        one.start();
        two.start();
        thee.start();
        four.start();

        System.out.println(strings);




        System.out.println("End of main!!");
//        worker.start();
//        worker.start();
//        worker.start();
//        worker.start();
//        worker.start();
//        worker.start();




    }


}
