package pl.com.tkarolczyk.sorting;

import java.util.Comparator;

public class heightComaparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {

        return (int)(o1.getHeight() - o2.getHeight());
    }
}


