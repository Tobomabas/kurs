package pl.com.tkarolczyk.inner_class;

public class Vehicle {
    private String vehicleName;
    private Wheel wheels;

    public Vehicle(String vehicleName, Wheel wheels) {
        this.vehicleName = vehicleName;
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleName='" + vehicleName + '\'' +
                '}';
    }








    public static class Wheel{
        private int sizeInInches;


        public Wheel(int sizeInInches) {
            this.sizeInInches = sizeInInches;
        }

        @Override
        public String toString() {
            return "Wheel{" +
                    "sizeInInches=" + sizeInInches +
                    '}';
        }
    }



}
