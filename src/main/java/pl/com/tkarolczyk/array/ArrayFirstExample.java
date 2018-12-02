package pl.com.tkarolczyk.array;

import pl.com.tkarolczyk.animal.Animal;
import pl.com.tkarolczyk.animal.Cat;
import pl.com.tkarolczyk.animal.Dog;

import java.lang.reflect.Array;

public class ArrayFirstExample {



    String[][] literaJ ={

            {"*", "*","*", "*",},
            {" ", " "," ", "*",},
            {" ", " "," ", "*",},
            {" ", " "," ", "*",},
            {"*", " "," ", "*",},
            {" ", "*","*", "*",},

    };

public void dawaj() {
    for (int i = 0; i < literaJ.length; i++) {
        for (int a = 0; a < literaJ[i].length; a++) {
            System.out.print(literaJ[i][a]);
        }
        System.out.println();
    }
}

    public static void main(String[] args) {

        String[][] literaJ ={

                {"*", "*","*", "*",},
                {" ", " "," ", "*",},
                {" ", " "," ", "*",},
                {" ", " "," ", "*",},
                {"*", " "," ", "*",},
                {" ", "*","*", "*",},};

//    String[][] tomek = {
//            {literaJ, literaJ, literaJ, literaJ}
//    };
//
//        for(int x = 0; x < tomek[0][0].length; x++){
//            for (int i = 0; i < tomek[0][0].length; i++) {
//                for (int a = 0; a < tomek[0][i].length; a++) {
//                    System.out.print(literaJ[i][a]);
//                }
//            }
//        }
//

//        System.out.println(tomek[0][1]);
//
////        for (int i = 0; i < tomek.length; i++){
//            System.out.print(tomek[3][0]);
//            System.out.print(tomek[3][1]);
//            System.out.print(tomek[3][2]);
////        }






        System.out.println("*************************************");
        System.out.println("*************************************");
        System.out.println("*************************************");
        System.out.println("*************************************");

        int[] firstArray = new int[4];
        Object o = firstArray;
        firstArray = new int[5];

        Object[] objects = new Object[2];
        for (int i = 0; i < firstArray.length; i++) {


        }
        Animal[] animals = makeAnimals();
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
        }
        for (Animal aaa : animals) {
            System.out.println(aaa);
        }
        checkEnhancedFor();


        System.out.println("/////////////////////////////////////////////////////////////");


        Animal[] animals1 = new Animal[2];
        animals1[0] = new Dog();
        animals1[1] = new Cat();
        processAnimalArray(animals1);

        Dog[] dogs = new Dog[2];
        dogs[0] = new Dog();
        dogs[1] = new Dog();
        processAnimalArray(dogs);


        Cat[] cats = new Cat[2];
        cats[0] = new Cat();
        cats[1] = new Cat();
        processAnimalArray(cats);

        System.out.println("///////////////////////////////////////////////////////////////");

        addCatToArray(cats);
        addCatToArray(dogs);
        addCatToArray(animals);


    }

    public static Animal[] makeAnimals() {
        Animal[] result = new Animal[2];
        result[0] = new Dog();
        result[1] = new Cat();

        return result;
    }

    public static void checkEnhancedFor() {
        Object[] objects = new Object[10];
        Dog[] dogs = new Dog[11];
        Cat[] cats = new Cat[20];
        for (Object o : objects) {
            System.out.println(o);
        }
        for (Dog d : dogs) {
            System.out.println(d);
        }
        for (Cat c : cats) {
            System.out.println(c);
        }

    }

    public static void processAnimalArray(Animal[] animals) {
        for (Animal animal : animals) {
            animal.wichAnimal();

        }


    }

    public static void addCatToArray(Animal[] cats) {

        if (cats instanceof Cat[]) {
            cats[0] = new Cat();
        } else {
            System.out.println("WaRniNg !");
        }


    }


}
