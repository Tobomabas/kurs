package pl.com.tkarolczyk.Vehicle;

public class Boat extends Vehicle {


    public void swim() {

        System.out.println("swim()");

    }

    @Override
    public void move() {
        //super.move();
        System.out.println("Boat is swimming");


    }
    @Override
    public String toString() {
        return "Boat";
    }
//    @Override
//    public void increaseSpeed(){
//
//        System.out.println("increaseSpeed() form Boat");
//
//    }
    @Override
    public void increaseSpeed(){

    System.out.println("increaseSpeed() form Boat");

}
}
