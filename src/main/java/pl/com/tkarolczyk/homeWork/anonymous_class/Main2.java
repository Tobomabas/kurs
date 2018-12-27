package pl.com.tkarolczyk.homeWork.anonymous_class;

import java.util.Comparator;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main2 {
//Zadanie to będzie wymagało dodatkowej lektury na temat interfejsu Comparator ze standardowej biblioteki Javy.
//        Pobierz od użytkownika 5 wyrazów, zapisz je w List. Użyj metody Collections.sort, przekazując jako argumenty listę oraz klasę anonimową, która posortuje
//        ją na podstawie długości wyrazów (najkrótsze wyrazy powinny być pierwsze).
//        Do sprawdzenia długości słowa możesz użyć metody String.length. Wyświetl zawartość listy przed i po sortowaniu.

    public static void main(String[] args) {
        List<String> tomek = Arrays.asList("B", "A", "D", "C", "F", "G", "E");
        Collections.sort(tomek, (o1, o2) ->(o2.length() - o1.length()));
        System.out.println(tomek);
        Collections.sort(tomek, (string2, string) -> (string2.compareTo(string)));
        System.out.println(tomek);
    }


}
