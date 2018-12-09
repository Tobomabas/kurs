package pl.com.tkarolczyk.anonymous_classes.null_avoid.optional;

public class Sink {

    private String label;

    public Sink(String label) {
       setLabel(label);
    }

    @Override
    public String toString() {
        return "Sink{" +
                "label='" + label + '\'' +
                '}';
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = validateLabel(label);
    }
    private String validateLabel(String label){

        if (null == label){
            throw new IllegalArgumentException("label cannot be null!!");
        }
        return label;
    }
}





