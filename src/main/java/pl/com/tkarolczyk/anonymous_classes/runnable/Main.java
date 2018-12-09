package pl.com.tkarolczyk.anonymous_classes.runnable;

public class Main  {



class newKlass implements Runnable{

    public void run(){

        System.out.println("run form newKlass");

    }

}
     static void processRunnable(Runnable runnable) {

        System.out.println();
        System.out.println("inside processRunnable");
        runnable.run();
        System.out.println();
}

    public void main(String[] args) {

    newKlass newKlass = new newKlass(){

           public void run() {

           }
       };


        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("my anonymous Runnable()");

            }
        };
        processRunnable(runnable);
        processRunnable(new Runnable() {
            @Override
            public void run() {
                System.out.println("something from total new Runnable");
            }
        });


        newKlass newKlass1 = new newKlass(){
            @Override
            public void run() {
                System.out.println("sskjnjs");
            }

        };
        processRunnable(() -> System.out.println("my lambda !"));

    }

}
