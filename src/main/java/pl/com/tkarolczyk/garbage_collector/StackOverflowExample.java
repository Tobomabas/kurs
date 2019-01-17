package pl.com.tkarolczyk.garbage_collector;

public class StackOverflowExample {

    public static void main(String[] args) {
    //test();
        one();
    }

    public static void test(){
        test();
    }

    public static void one(){
        two();
    }

    public static void two(){
        one();
    }
}
