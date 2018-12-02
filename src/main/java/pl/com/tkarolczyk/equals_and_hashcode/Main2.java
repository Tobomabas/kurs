package pl.com.tkarolczyk.equals_and_hashcode;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {

        List<Person> person = new ArrayList();
        person.add(new Person("ad", "b", 33));
        person.add(new Person("add", "bd", 33));
        person.add(new Person("a", "b", 33));
        person.add(new Person("Wojciech", "Ixinski", 22));


        Person personToFind = new Person("a", "b", 33);


        System.out.println(person.contains(personToFind));


        Set<Person> personSet = new HashSet<>();
        personSet.addAll(person);
        System.out.println(personSet.size());

        for (Person a : personSet){
            System.out.println("Person: " + a);

        }
        Set<Person> anotherSet = new LinkedHashSet<>();
        List<Person> personList = new LinkedList<>();

    }
}
