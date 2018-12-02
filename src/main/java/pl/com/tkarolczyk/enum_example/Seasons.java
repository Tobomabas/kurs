package pl.com.tkarolczyk.enum_example;

public enum Seasons {

    WINTER (-25),
    SPRING (15),
    SUMMER (30),
    AUTOMN (10);


    private float averageTempInC;

    private Seasons (float averageTempInC){
        this.averageTempInC = averageTempInC;

    }

    public float getAverageTempInC() {
        return averageTempInC;
    }
}
