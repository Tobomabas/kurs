package pl.com.tkarolczyk.sorting.sorting2;


import pl.com.tkarolczyk.sorting.Person;

public class OwnerComparator  {


    public static int compareByOwner(Clothes clothes, Clothes clothes2) {
        return clothes.getOwner().compareTo(clothes2.getOwner());
    }
}
