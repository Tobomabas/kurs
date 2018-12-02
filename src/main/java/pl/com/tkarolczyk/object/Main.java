package pl.com.tkarolczyk.object;

public class Main {

    public static void main(String[] args) {

        Person Tomek = new Person("Tomek");
        Tomek.introducePerson();
        Person Dawid = new Person("Dawid", "Kowalski", 28);
        Dawid.introducePerson();
        Person Wojtek = new Person();
        Wojtek.introducePerson();
        Person.somethingAboutPersons();
        Person me = new Person();

        Person nullPerson = null;
        nullPerson.somethingAboutPersons();
        //nullPerson.introducePerson();

        me.introducePerson();
       // me.somethingAboutPers();

        System.out.println(Person.numbrOfPersons);

    }





}
