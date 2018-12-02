package pl.com.tkarolczyk.Continent;

public class Europe extends Continent {

    private String kraj;
    static {
        System.out.println("Statick block Europe");
    }
    static {
        System.out.println("Statick2 block Europe");
    }
    {
        System.out.println("Non Statick block Europe");
    }
    {
        System.out.println("Non Statick2 block Europe");
    }

    public Europe(){
        super();

    }

    public Europe(String kraj){
        this.kraj = kraj;
        System.out.println(kraj);



    }


}
