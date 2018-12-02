package pl.com.tkarolczyk;

public class Car {

    private String brand;
    private String model;
    private String color;
    private int yearOfProduction;

// construktor
    public Car(String brand, String model, String color, int yearOfProduction) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.yearOfProduction = yearOfProduction;

}

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

    public static void main(String[] args) {
      // toyota to jest referencja
      Car toyota = new Car("Toyota", "Yaris", "Gray", 2007);
      // toyota2 to jest referencja
      Car toyota2 = new Car("Honda", "Accord","Black", 2018);

      Car autoTomka = toyota;


      System.out.println(autoTomka);
        autoTomka.setColor("blue");
        System.out.println(autoTomka);
        System.out.println(toyota);
        System.out.println("Kolor auta Tomka: " + autoTomka.getColor());

        Car autoMarka = null;
        System.out.println(autoMarka);

    }

}
