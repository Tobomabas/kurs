package pl.com.tkarolczyk.thread.executor;

import java.util.concurrent.Executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {

        Runnable job = () -> {
            for(int i = 0; i<100; i++){
                System.out.println(String.format("i = [%d], run bye [%s]", i, Thread.currentThread().getName()));
            }
        };

        ExecutorService executor = Executors.newSingleThreadExecutor();
        for(int i = 0; i<100; i++) {
            executor.execute(job);

        }


        ExecutorService executor1 = Executors.newFixedThreadPool(50);
        for(int i = 0; i<100; i++) {
            executor1.execute(job);
        }
        ExecutorService executor2 = Executors.newFixedThreadPool(50);
        for(int i = 0; i<100; i++) {
            executor1.execute(job);

        }
        executor1.shutdownNow();

        executor1.execute(job);
        executor.shutdownNow();


    }
}
