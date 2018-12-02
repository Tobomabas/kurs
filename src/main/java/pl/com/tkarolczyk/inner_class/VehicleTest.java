package pl.com.tkarolczyk.inner_class;
import static pl.com.tkarolczyk.inner_class.Vehicle.Wheel;

public class VehicleTest {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Ferrari");
        Wheel wheel = new Wheel(25);
    }


}
