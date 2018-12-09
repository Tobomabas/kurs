package pl.com.tkarolczyk.anonymous_classes.null_avoid.optional;
import java.util.Optional;
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
    public Optional<Bathroom> getBathroom() {
        return Optional.ofNullable(bathroom);
    }
    public void setBathroom(Bathroom bathroom) {
        this.bathroom = bathroom;
    }
}
