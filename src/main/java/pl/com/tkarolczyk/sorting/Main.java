package pl.com.tkarolczyk.sorting;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("Tomasz", "Karollczyk", 1, 11, 111, 180, 41),
                new Person("Andrzecj ", "ABC", 22, 11, 22222, 190, 44),
                new Person("Michał", "XYZ", 11, 111, 234, 120, 44),
                new Person("Wojtek", "Persan", 55, 21, 4344, 110, 33),
                new Person("Łukasz", "Smith", 34, 143, 321, 1450, 24),
                new Person("Ania", "Kowalski", 21, 156, 234, 175, 33),
                new Person("kasia", "Weber", 56, 87, 101, 177, 64),
                new Person("Zosia", "Nowak", 99, 5, 120, 210, 48)
        );
//        Collections.sort(personList);
//        System.out.println(personList);
//         System.out.println(personList.get(0).compareTo(personList.get(1)));
        Collections.sort(personList);
        System.out.println(personList);

        Collections.sort(personList, new ShoerComparator());
        System.out.println(personList);

        Collections.sort(personList, new heightComaparator());
        System.out.println(personList);

        Collections.sort(personList, (o1,o2) -> (o1.getAge()-o2.getAge()));
        System.out.println(personList);
        
        Collections.sort(personList, (o1,o2) -> (int)(o1.getShoeSize()- o2.getShoeSize()));
        System.out.println(personList);

        Collections.sort(personList, (Comparator.comparing(Person::getName)));
        Collections.sort(personList, NameComparing::comparePersonsByName);

        personList.sort(NameComparing::comparePersonsByName);
    }




}
