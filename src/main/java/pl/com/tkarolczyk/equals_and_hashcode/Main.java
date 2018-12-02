package pl.com.tkarolczyk.equals_and_hashcode;
public class Main {
    public static void main(String[] args) {
        Person me = new Person("Tomasz", "Karolczyk", 33);
        Person tomas = me;
        System.out.println("me equals tomas: " + me.equals(tomas));

        System.out.println("me == tomas: " + (me == tomas));
        tomas = new Person("Tomaszz", "Karolczyk", 33);
        System.out.println("and now, me == tomas? " + (me == tomas));
        System.out.println("me equals tomas: " + me.equals(tomas));
    }





}
