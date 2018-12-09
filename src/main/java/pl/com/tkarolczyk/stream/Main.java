package pl.com.tkarolczyk.stream;
import pl.com.empas.java_introductory_course.java8.avoid_null.Computer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {
        List<Country> countries = Arrays.asList(
                new Country(40_000_000, "Poland", 312, 5_000),
                new Country(140_000_000, "China", 2312, 2_000),
                new Country(20_000_000, "Germany", 2312, 15_000),
                new Country(10_000_000, "Ukraine", 3212, 2_000),
                new Country(240_000_000, "Zimbabwe", 2312, 500),
                new Country(420_000_000, "Japan", 3212, 25_000)
        );
        List<Country> result =filterByMinimalNumberOfPeople2(countries, country -> country.getAveragePayCheck() > 10_000);
        System.out.println(filterByMinimalNumberOfPeople2(countries, country -> country.getNumberOfPeople() >= 40_000));
        result.forEach(country -> System.out.println(country));
    }
    private static List<Country> countries(List<Country> country){
        List<Country> result = new ArrayList<>();
        for (Country country1 : country ){
            if(country1.getAveragePayCheck() >=4_000){
                result.add(country1);
            }
        }
        return result;
    }
    private static List<Country> getListoFCountriesWithmoreThan50000(List<Country> country, long minimalNumberOfPeope){
        List<Country> result = new ArrayList<>();
        for (Country country1 : country ){
            if(country1.getNumberOfPeople() >= minimalNumberOfPeope){
                result.add(country1);
            }
        }
        return result;
    }
private static List<Country> filterByMinimalNumberOfPeople(List<Country> countries, long minimalPeople){
        return   countries.stream()
                .filter(country -> country.getNumberOfPeople() >= minimalPeople)
                .collect(Collectors.toList());
}
    private static List<Country> filterByMinimalNumberOfPeople2(List<Country> countries, Predicate<Country> predicate){
        return   countries.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }
}
