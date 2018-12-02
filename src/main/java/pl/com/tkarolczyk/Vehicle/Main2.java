package pl.com.tkarolczyk.Vehicle;

public class Main2 {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Vehicle car = new Car();
        Vehicle boat = new Boat();
        Vehicle bike = new Bicycle();

        vehicle.move();
        car.move();
        boat.move();
        System.out.println("-----------------------");

        vehicle.increaseSpeed();
        car.increaseSpeed();
        boat.increaseSpeed();
        bike.increaseSpeed();

        System.out.println("-----------------------");

        increaseSpeed(vehicle);
        increaseSpeed(car);
        increaseSpeed(boat);
        increaseSpeed(bike);

        System.out.println("-----------------------");

        processVehicle(vehicle);
        processVehicle(car);
        processVehicle(boat);
        processVehicle(bike);



    }


    public static void processVehicle(Vehicle vehicle) {

        System.out.println(vehicle);

    }

    public static void increaseSpeed(Vehicle vehicle){

        vehicle.increaseSpeed();
    }




}
