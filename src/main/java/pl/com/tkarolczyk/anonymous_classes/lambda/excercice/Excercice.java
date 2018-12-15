package pl.com.tkarolczyk.anonymous_classes.lambda.excercice;

//chcemy lambdy

@FunctionalInterface
public interface Excercice {

    void swim();
    default void jogging(){}
    default void joggin2(){}



}
