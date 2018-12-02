package pl.com.tkarolczyk.Vehicle;

public class Car extends Vehicle {

    public void speedUp() {

        System.out.println("speedUp()");


    }

    @Override
    public void move() {
        // super.move();
        System.out.println("car is driving now");
    }

    @Override
    public String toString() {
        return "Car";
    }
//    @Override
//    public String speedUp(){
//        return "car";
//
//    }
    @Override
    public void increaseSpeed(){

        System.out.println("increaseSpeed() form Car");
        }

}
