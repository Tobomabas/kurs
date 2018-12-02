package pl.com.tkarolczyk.Vehicle;

public class Bicycle extends Vehicle {


    @Override
    public String toString() {
        return "Bicycle";
    }
    @Override
    public void increaseSpeed(){

        System.out.println("increaseSpeed() form Bicycle");

    }




}
