package pl.com.tkarolczyk.sorting.sorting3;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // 7 aut
        // do kolekcji
        // naturalny porządek

        List <Car> carList = Arrays.asList(

                new Car("Audi", "A8", "Black", LocalDate.of(2008,12,12), 500),
                new Car("Mercedes", "C", "Black", LocalDate.of(2009,12,12), 500),
                new Car("Audi", "A5", "Black", LocalDate.of(2018,12,12), 56),
                new Car("Toyota", "Yaris", "Black", LocalDate.of(2008,12,12), 90),
                new Car("Honda", "Civic", "Black", LocalDate.of(2008,12,12), 250),
                new Car("Fiat", "Punto", "Black", LocalDate.of(2011,12,12), 500),
                new Car("Opel", "Astra", "Black", LocalDate.of(2010,12,12), 500)
        );
        System.out.println("Befroe Sorting");
        System.out.println(carList);
        System.out.println("After Sorting");
        Collections.sort(carList);
        System.out.println(carList);


        System.out.println("///////////////////////////////////////");
        carList.sort(new CarPowerComparator().reversed());
        System.out.println(carList);
        carList.sort(new CarPowerComparator());
        System.out.println(carList);

        carList.sort((o1, o2) -> o1.getColorur().compareTo(o2.getColorur()));

        CarPlayer carPlayer = new CarPlayer();
        carPlayer.playWithCarActions(carList.get(0), car -> System.out.println("Car is Flying"));

        carList.get(2).maybeComapre(o -> o.getPower());


        System.out.println("////////////////////////////");
        System.out.println("////////////////////////////");
        System.out.println("////////////////////////////");
        System.out.println("////////////////////////////");

        carList.get(2).concatTwoBrands(carList.get(1));

        carList.get(3).doSomething(object -> System.out.println((object.getBrand()+ "-")));













    }
}
