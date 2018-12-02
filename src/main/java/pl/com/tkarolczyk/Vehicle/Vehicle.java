package pl.com.tkarolczyk.Vehicle;

public class Vehicle {

    public void printName(){

        System.out.println("Vehicle");

    }

    public void move(){

        System.out.println("MOVE!!!!!!!!!!!!!!!!!!");
    }

    @Override
    public String toString() {
        return "Vehicle";
    }

    public void increaseSpeed(){

        System.out.println("increaseSpeed() form Vehicle");

    }
}
