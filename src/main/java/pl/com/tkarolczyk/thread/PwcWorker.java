package pl.com.tkarolczyk.thread;

public class PwcWorker extends Thread {


    private Runnable jobToDo;
    private  Thread afterThis;

    public PwcWorker(String name, Runnable jobToDo, Thread afterThis) {
        super(jobToDo);
        setName(name);
        this.jobToDo = jobToDo;
        this.afterThis = afterThis;
    }

    @Override
    public synchronized void start() {
        try {
            afterThis.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        super.start();
    }
}
