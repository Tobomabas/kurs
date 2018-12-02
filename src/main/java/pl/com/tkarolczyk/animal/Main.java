package pl.com.tkarolczyk.animal;

import static pl.com.tkarolczyk.animal.AnimalStatus.*;


public class Main {

    public static void main(String[] args) {

        //Dog lola = new Dog();
//        lola.wichAnimal();
//        lola.makeSound();

        NewDog lola = new NewDog("Lola", AnimalStatus.ALIVE);
        Animal maybeCat = new Cat();
        Animal maybeMonkey = new Monkey();
        Object monkey = new Monkey();


      //  maybeDog.wichAnimal();
     //   maybeDog.makeSound();
      //  AnimalStatus status = AnimalStatus.valueOf(<AnimalStatus.DIED)

        System.out.println(lola.getAnimalStatus());
        lola.setAnimalStatus(NOTBORNYET);
        System.out.println(lola.getAnimalStatus());
        lola.setAnimalStatus(ALIVE);
        System.out.println(lola.getAnimalStatus());




    }





}
