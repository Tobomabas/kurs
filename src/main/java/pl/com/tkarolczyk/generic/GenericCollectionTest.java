package pl.com.tkarolczyk.generic;

import pl.com.tkarolczyk.animal.Animal;
import pl.com.tkarolczyk.animal.Cat;
import pl.com.tkarolczyk.animal.Dog;

import java.util.LinkedList;
import java.util.List;

public class GenericCollectionTest {

    public static void main(String[] args) {
        Dog[] dogs = new Dog[2];
        dogs[0] = new Dog();
        dogs[1] = new Dog();

        List<Cat> catsList = new LinkedList<>();
        catsList.add(new Cat());
        catsList.add(new Cat());
        List<Dog> dogsList = new LinkedList<>();
        dogsList.add(new Dog());
        dogsList.add(new Dog());

        takeListOfAnimals(dogsList);
        takeListofAnimals(dogs);
    }

    public static void takeListofAnimals(Animal[] animals) {
        for (Animal a : animals) {
            System.out.println(a);
        }
       // animals[0] = new Cat(); tak nie mozna :)
    }

    public static void takeListOfAnimals(List<? extends Animal> animals){

        for (Animal a : animals) {
                System.out.println(a);
//            animals.add(new Dog());

        }


    }

    public static void addDog (List<Animal>animals){
        animals.add(new Dog());
    }
}

