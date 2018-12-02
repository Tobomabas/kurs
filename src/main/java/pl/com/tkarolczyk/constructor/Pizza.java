package pl.com.tkarolczyk.constructor;

public class Pizza extends Dish {

    static {

        System.out.println("Pizza - static block");
    }
    {
        System.out.println("Pizza - non Static block");
    }

    public Pizza(){
        this("ser");
        System.out.println("Pizza()");
    }
    public Pizza(String addons){
        super();

        System.out.println("Pizza with addons...");
    }


}
