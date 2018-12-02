package pl.com.tkarolczyk.constructor;

public class Dish {
    static {
        System.out.println("Dish first static block");

    }

    static {
        System.out.println("Dish second static block");

    }

    private String kind;
    private int hmmm;


    {
        System.out.println("Dish non static block");
    }

    //overloading
    public Dish() {
//        this("pasta");
        System.out.println("Dish()");

    }

    //overloading
    public Dish(int hmmm) {
        System.out.println("Dish()");


    }

    //overloading
//    public Dish(String kind) {
//        System.out.println("Dish() " + kind);
//        this.kind = kind;
//    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
}


