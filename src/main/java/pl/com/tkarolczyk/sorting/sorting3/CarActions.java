package pl.com.tkarolczyk.sorting.sorting3;

@FunctionalInterface
public interface CarActions {

    default void move(Car car) {}
    void fly(Car car);


    }

