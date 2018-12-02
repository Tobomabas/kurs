package pl.com.tkarolczyk.homeWork.constructors;

public class Furniture {

    static {
        System.out.println("text ze statica z Furniture");
    }
    {
        System.out.println("Text z bloku ");
    }
    private String color;
    public Furniture(String color){

        this.color = color;

    }public Furniture(){

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void color() {

        color = "niebieski";


        Furniture chair = new Chair();
        Furniture table = new Table();
        Furniture furniture = new Furniture("zielony");




    }
}
