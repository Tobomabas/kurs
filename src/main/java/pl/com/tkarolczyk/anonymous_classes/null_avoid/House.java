package pl.com.tkarolczyk.anonymous_classes.null_avoid;

public class House {
    private Bathroom bathroom;

    public House(Bathroom bathroom){

        this.bathroom = bathroom;

    }


    @Override
    public String toString() {
        return "House{" +
                "bathroom=" + bathroom +
                '}';
    }

    public Bathroom getBathroom() {
        return bathroom;
    }

    public void setBathroom(Bathroom bathroom) {
        this.bathroom = bathroom;
    }
}
