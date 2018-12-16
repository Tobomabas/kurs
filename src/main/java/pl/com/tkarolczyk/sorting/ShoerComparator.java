package pl.com.tkarolczyk.sorting;

import java.util.Comparator;

public class ShoerComparator implements Comparator<Person> {

    @Override
        public int compare(Person o1, Person o2) {

         return (int)(o1.getShoeSize() - o2.getShoeSize());
    }
}
