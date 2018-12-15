package pl.com.tkarolczyk.anonymous_classes.lambda.excercice;

public class Main {
String jakisinny;

    public static void main(String[] args) {

        Trainer trainer = new Trainer();
        MyThread myThread = new MyThread();



        Excercice job = new Excercice() {
            @Override
            public void swim() {
                System.out.println("Swimming !!");
            }
        };
        Excercice lambdaJob = () -> {};  // void swim
        MyRunnable run = () -> {};       // void run


        trainer.performExcercice(() -> System.out.println("Swim"));
        trainer.performExcercice(lambdaJob);

        myThread.prformanceJob(() -> System.out.println("run"));
        myThread.prformanceJob(run);
    }
    private static Excercice makeNewExcercise (){

        return new Excercice() {
            @Override
            public void swim() {
                System.out.println("My new Excercise!!");
            }
        };
    }
//
//    private Excercice makeNewExcerciseInLabda(){
//
//        return () -> {this.jakisinny};
//
//
//
}
