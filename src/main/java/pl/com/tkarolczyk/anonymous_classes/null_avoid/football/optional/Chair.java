package pl.com.tkarolczyk.anonymous_classes.null_avoid.football.optional;

public class Chair {

    private int number;

    public Chair(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "number=" + number +
                '}';
    }
}
