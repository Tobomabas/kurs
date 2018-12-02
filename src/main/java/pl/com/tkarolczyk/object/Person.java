package pl.com.tkarolczyk.object;

public class Person {
    public static int numbrOfPersons = 0;
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {

        this.name = name;
        this.surname = surname;
        this.age = age;
        numbrOfPersons++;
    }

    public Person() {
        numbrOfPersons++;
        //empty
    }

    public Person(String name) {

        this.name = name;
        numbrOfPersons++;

    }

    public static void somethingAboutPersons() {
        System.out.println("All People like math!!!");
    }

    public static void newStatic() {
        // System.out.println("Name: " + name);

    }

    public static void printNumberOfPersons() {
        System.out.println("Number of persons: " + numbrOfPersons);

    }

    public void introducePerson() {

        System.out.println("Hi my name is: " + name + " my surname is: " + surname + " i'm: " + age);


    }


}
