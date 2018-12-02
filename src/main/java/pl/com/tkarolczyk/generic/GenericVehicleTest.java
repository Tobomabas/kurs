package pl.com.tkarolczyk.generic;

import pl.com.tkarolczyk.Interface_example.Plane;
import pl.com.tkarolczyk.Vehicle.Bicycle;
import pl.com.tkarolczyk.Vehicle.Car;
import pl.com.tkarolczyk.Vehicle.Vehicle;
import pl.com.tkarolczyk.animal.Dog;

import java.util.ArrayList;
import java.util.List;

public class GenericVehicleTest {

    public static void main(String[] args) {

        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new Car());
        vehicleList.add(new Bicycle());
        List<Car> carList = new ArrayList<>();

        carList.add(new Car());
      //  carList(takeListOfVehicle(vehicleList));
        takeListOfVehicle(vehicleList);

    }




    public static void takeListOfVehicle(List<? extends Vehicle> vehicle) {

        for (Vehicle vehicle1 : vehicle) {
            System.out.println(vehicle);
        }

    }

}
