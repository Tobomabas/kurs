package pl.com.tkarolczyk.anonymous_classes.runnable;

public class FabricExample {
    public static void main(String[] args) {
        MyRun jeden = new MyRun();
        jeden.run();
        MyRun dwa = new MyRun();
        dwa.run();
        makeNewRunnable();
        makeNewRunnable();
    }

    private static Runnable makeNewRunnable() {
        return new Runnable() {
            private String name = "Tomek";

            @Override
            public void run() {
                System.out.println("my name: " + this.name);
            }
        };
    }

    private static Runnable makeNewRunable2() {
        return () -> {
            String name = "tomek";
            System.out.println("test" + name);
        };
    }
}

class MyRun implements Runnable {
    private String name = "Tomek2";

    public void run() {
        System.out.println("my name from myRun: " + this.name);
    }
}