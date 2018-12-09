package pl.com.tkarolczyk.anonymous_classes;

import pl.com.tkarolczyk.switch_test.Month;

public class Main {
    public static void main(String[] args) {

        Animal monkey = new Monkey();
        Animal parrot = new Animal() {
            @Override
            public void printAnimalName() {
                System.out.println("Parrot");
            }
        };
        Animal duck = new Animal() {
            @Override
            public void printAnimalName() {
                System.out.println("DUCK");

            }
            public void makeSound(){
                System.out.println("kwa kwa");
            }

        };

        Monkey monkey1 = new Monkey(){

            @Override
            public void printAnimalName() {
                System.out.println("Gorilla");
            }
        };


        AnimalProcessor processor = new AnimalProcessor();
        processor.processAnimal(monkey);
        processor.processAnimal(parrot);
        processor.processAnimal(duck);
        processor.processAnimal(new Animal() {
            @Override
            public void printAnimalName() {
                System.out.println("DUCK !!");
            }
        });


    ShowSecret secret = new ShowSecret() {
        @Override
        public void printSecret() {

        }
    };



    SeceretProcessor seceretProcessor = new SeceretProcessor();
    seceretProcessor.processSeret(new ShowSecret() {
        @Override
        public void printSecret() {

        }
    });

    MoveProcessor moveProcessor = new MoveProcessor();
    moveProcessor.processMove(new Moveable() {
        @Override
        public void run() {

        }

        @Override
        public void fly() {

        }
    });







    }
}