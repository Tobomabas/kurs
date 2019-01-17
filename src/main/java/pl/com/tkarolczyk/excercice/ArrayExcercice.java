package pl.com.tkarolczyk.excercice;

import java.util.Arrays;
import java.util.Objects;

public class ArrayExcercice {

    public static void main(String[] args) {

        int[] array = {1, 2, 3};
        Integer[] arrayOfIntegers = {1, 2, 3};

        Object[] objects = arrayOfIntegers;

        System.out.println(arrayOfIntegers.toString());

        Object o = array;
        System.out.println(array.toString());
    Anonymous anonymous = new Anonymous();
        System.out.println(anonymous.toString());
    }

}


class Anonymous{




}