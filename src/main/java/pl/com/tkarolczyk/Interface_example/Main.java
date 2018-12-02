package pl.com.tkarolczyk.Interface_example;

public class Main {

    public static void main(String[] args) {

        Plane samolot = new Plane("Pasażerski", 25);
        String nowy = samolot.fly();
        System.out.println(samolot.fly());
        System.out.println(samolot.toString() + nowy);
    }

}
