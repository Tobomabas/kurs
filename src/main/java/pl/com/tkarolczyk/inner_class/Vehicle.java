package pl.com.tkarolczyk.inner_class;

public class Vehicle {
    private String vehicleName;

    public Vehicle(String vehicleName) {
        this.vehicleName = vehicleName;
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
