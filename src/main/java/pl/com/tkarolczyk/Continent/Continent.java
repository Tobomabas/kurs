package pl.com.tkarolczyk.Continent;

public class Continent {

    static {
        System.out.println("Statick block Continent");
    }

    static {
        System.out.println("Statick2 block Continent");
    }
    {
        System.out.println("Non Statick block Continent");
    }
    {
        System.out.println("Non Statick2 block Continent");
    }


    public Continent(){
        this("default");

    }

    private String nazwa;
    public Continent(String nazwa){
        this.nazwa = nazwa;
        System.out.println(nazwa);


    }

}
