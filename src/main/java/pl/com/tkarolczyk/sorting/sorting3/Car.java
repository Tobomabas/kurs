package pl.com.tkarolczyk.sorting.sorting3;

import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;

public class Car implements Comparable <Car>, CarConcat<Car> {


    private String brand;
    private String model;
    private String colorur;
    private LocalDate productionYear;
    private int power;

    public Car(String brand, String model, String colorur, LocalDate productionYear, int power) {
        this.brand = brand;
        this.model = model;
        this.colorur = colorur;
        this.productionYear = productionYear;
        this.power = power;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", colorur='" + colorur + '\'' +
                ", productionYear=" + productionYear +
                ", power=" + power +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColorur() {
        return colorur;
    }

    public LocalDate getProductionYear() {
        return productionYear;
    }

    public int getPower() {
        return power;
    }

//    @Override
//    public int compareTo(@NotNull Car o) {
//        return productionYear.getYear() - o.productionYear.getYear();
//
//        //return productionYear.compareTo(o.productionYear);
//    }



    public void maybeComapre(Comparable<Car> carComparable){


    }


    public int compareTo(@NotNull Car o){
        return power-o.power;

    }

    @Override
    public void concatTwoBrands(Car object) {
        System.out.println(brand + "-" + object.brand);

    }

    public void doSomething(CarConcat<Car> car){

        car.concatTwoBrands(this);


    }


}


