package pl.com.tkarolczyk.stream;

public class Country {
    private long numberOfPeople;
    private String name;
    private double area;
    private double averagePayCheck;

    public Country(long numberOfPeople, String name, double area, double averagePayCheck) {
        this.numberOfPeople = numberOfPeople;
        this.name = name;
        this.area = area;
        this.averagePayCheck = averagePayCheck;
    }

    public long getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(long numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getAveragePayCheck() {
        return averagePayCheck;
    }

    public void setAveragePayCheck(double averagePayCheck) {
        this.averagePayCheck = averagePayCheck;
    }

    @Override
    public String toString() {
        return "Country{" +
                "numberOfPeople=" + numberOfPeople +
                ", name='" + name + '\'' +
                ", area=" + area +
                ", averagePayCheck=" + averagePayCheck +
                '}';
    }
}
