package pl.com.tkarolczyk.enum_example;

public enum Subject {

    MATH (25),
    BIOLOGY (4),
    GEOGRAPHY (10),
    FRENCH (15);

    float hours;
    private Subject (float hours) {
        this.hours = hours;
    }
    public float getHours() {
        return hours;
    }
}
