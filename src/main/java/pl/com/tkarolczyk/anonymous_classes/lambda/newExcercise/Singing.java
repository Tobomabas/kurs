package pl.com.tkarolczyk.anonymous_classes.lambda.newExcercise;


@FunctionalInterface
public interface Singing {

    void bass();
    default void sopran(){}
    default void middle(){}

}
