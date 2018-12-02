package pl.com.tkarolczyk.access.inner;

import pl.com.tkarolczyk.access.Person;

public class Main {


    public static void main(String[] args) {
        Person Tomek = new Person("Tomasz", "Karololczyk", -25);
        System.out.println(Tomek);
        Tomek.setAge(-50);
//        Tomek.age = -15;
//        Tomek.name = -15;
//        Tomek.Surname = -15;
        System.out.println(Tomek);
        Tomek.setName("MISZCZ");
        System.out.println(Tomek);
//        Tomek.secret = "My Seceret";
//        Tomek.secondSecret = "seconf Secret";
//        System.out.println(Tomek.secret);
//        child child = new child();
//        child.secondSecret = "hmmmmmm";


    }
}
