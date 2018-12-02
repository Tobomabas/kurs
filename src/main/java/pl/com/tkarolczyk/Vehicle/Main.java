package pl.com.tkarolczyk.Vehicle;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.printName();


        Vehicle car = new Car();


        car.printName();
        ((Car) car).speedUp();
        ((Car) car).speedUp();
        Car carForSure = (Car)car;

      //  Boat boat = (Boat)car;
    }

}
