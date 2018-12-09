package pl.com.tkarolczyk.anonymous_classes.null_avoid.football.optional;

public class Chair {

    private Number number;

    public Chair(Number number) {
        this.number = validate(number);
    }

    @Override
    public String toString() {
        return "Chair{" +
                "number=" + number +
                '}';
    }

    public Number getNumber() {
        return number;
    }

    public void setNumber(Number number) {
        this.number = validate(number);
    }

    private Number validate (Number number){

        if (null == number){
            throw new IllegalArgumentException("Stadion Cannot be NULL!!");
        }
        return number;
    }
}
