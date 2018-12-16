package pl.com.tkarolczyk.sorting.sorting2;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Clothes> clotheslist = Arrays.asList(
                new Clothes("Tomek", "Bluza"),
                new Clothes("Monika", "spodnie"),
                new Clothes("Wojtek", "sarpety"),
                new Clothes("Andrzej", "krótkie spodenki"),
                new Clothes("xomek", "koszulka")
        );
        //clotheslist.sort(OwnerComparator::compareByOwner);
        Comparator<Clothes> myComp =
        Comparator.comparing(Clothes::getOwner).reversed().thenComparing(Clothes::getType);






    }
}
