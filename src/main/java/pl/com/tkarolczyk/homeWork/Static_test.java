package pl.com.tkarolczyk.homeWork;

public class Static_test {

    public static void main(String[] args) {
        Klient tomek = new Klient("Tomek");
        Klient tomek1 = new Klient("Tomek");
        Klient tomek2 = new Klient("Tomek");
        Klient tomek3 = new Klient("Tomek");


        System.out.println(tomek.getId());
        System.out.println(tomek1.getId());
        System.out.println(tomek2.getId());
        System.out.println(tomek3.getId());
    }









}

class Klient {
        String name;
        int id = 0;
        static int noweId = 0;

        Klient (String name){

            this.name = name;
            id = noweId;
            noweId++;


        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
