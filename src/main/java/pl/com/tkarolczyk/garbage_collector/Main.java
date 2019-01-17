package pl.com.tkarolczyk.garbage_collector;


public class Main {

    public static void main(String[] args) {
        {
            Object a = new Object();
        }

        System.gc();
        Object o = makeObject();
        empty();

        System.out.println(o);
    }

    public static Object makeObject(){

        String tomek = new String("How Are U !?");
        empty();
        return new String("String po returnie!");

    }

    public static void empty(){
    }


}
