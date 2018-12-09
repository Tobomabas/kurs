package pl.com.tkarolczyk.anonymous_classes.lambda;
@FunctionalInterface
public interface FormulaConverter {

    abstract double fromCelsiusToFahrenheit(double celsius);
    default double fromFahrenheittoCelcius(double fahr){
        return 0;
    }


}
