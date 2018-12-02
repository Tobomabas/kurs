package pl.com.tkarolczyk.collection.list;
import pl.com.tkarolczyk.plant.Cactus;
import pl.com.tkarolczyk.plant.Plant;
import pl.com.tkarolczyk.plant.Rose;
import pl.com.tkarolczyk.plant.Tulip;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class LIstFirstExample {

    public static void main(String[] args) {
      //Strinh[]
        List<String> strings = new ArrayList<>();
        strings.add("enum");
        strings.add("abstract");

        List<String> arrays = new ArrayList<>();
        arrays.addAll(strings);
        System.out.println("/////////////////");
        arrays.set(1, "dzienDobry");
        System.out.println(arrays.get(1));
        System.out.println(arrays.listIterator());

        List<Plant> plants = new ArrayList<>();
        plants.add(new Cactus(2, 23,10));
        plants.add(new Tulip(1, 13,10));
        plants.add(new Tulip(4, 133,110));
        plants.add(new Rose(23, 233,11));
        plants.add(new Rose(22, 233,11));

        plants.set(1, new Rose(2,2,2));
        //plants.remove(0);
        System.out.println(plants.size());

       // System.out.println(strings.get(0));

        for (int i = 0; i < strings.size(); i++){
            System.out.println(strings.get(i));
        }
        for (String s : strings) {
            System.out.println(s);
        }

      //  for(Months miesiac : Months.values())

    }
}
