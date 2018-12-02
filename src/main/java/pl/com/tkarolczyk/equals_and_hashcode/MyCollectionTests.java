package pl.com.tkarolczyk.equals_and_hashcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class MyCollectionTests {


    public static void main(String[] args) {
        Random random = new Random(1000);
        //  random.nextInt();

        List<Integer> firstOne = new ArrayList<>();
        List<Integer> secondOne = new LinkedList<>();


        for (int i = 0; i < 500; i++) {
            firstOne.add(random.nextInt());
            secondOne.add(random.nextInt());
        }
        for (Integer a : firstOne) {
            System.out.println(a);
        }

        System.out.println("Fistone: " + firstOne.size() + " SecondOne: " + secondOne.size());


    }


}
