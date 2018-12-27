package pl.com.tkarolczyk.anonymous_classes.lambda.method_reference;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        String a = "aaaa";
        String c = "aaaa";
        String b = "bbbb";

        System.out.println(BrandSorter.checkOrder(a, b));
        System.out.println(BrandSorter.checkOrder(b, a));
        System.out.println(BrandSorter.checkOrder(c, a));

        System.out.println(ModelSorter.modelOrder(a, b));
        System.out.println(ModelSorter.modelOrder(b, a));
        System.out.println(ModelSorter.modelOrder(c, b));
        Car saab = new Car ("Saab", "93", 200);
        Car audi = new Car ("Audi", "a4", 210);
        Car audi2 = new Car ("Audi", "a4", 210);
        Car mercedes = new Car ("Mercedes", "C", 220);

    }
      Car saab = new Car ("Saab", "93", 200);
      Car audi = new Car ("Audi", "a4", 210);
      Car mercedes = new Car ("Mercedes", "C", 220);
      List<Car> sortedCars = CarSorter.sortCarsBYModel(saab, audi,
              (first, second) -> first.compareTo(second));
    List<Car> sortedCars2 = CarSorter.sortCarsBYModel(saab, audi,
            ModelSorter::modelOrder);
    CarPrinter carPrinter = System.out::println;
    CarPrinter carPrinter2 = (Car car) -> System.out.println(car);
    CarPrinter carPrinter3 = car -> car.printYourself();
    CarPrinter carPrinter4 = Car::printYourself;
}
