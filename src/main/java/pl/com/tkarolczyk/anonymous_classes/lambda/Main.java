package pl.com.tkarolczyk.anonymous_classes.lambda;

public class Main {

    Moveable moveable = new Moveable() {
        @Override
        public void run() {
            System.out.println("run from moveable");
        }
    };
    Moveable moveable2 = () -> System.out.println("run from moveable 2 lambda");
    Swimable swimable = (distance, speed) -> System.out.println("My dist" + distance + " My Speed: " + speed);

    public static void main(String[] args) {






        FlyableCleaner flyableCleaner = new FlyableCleaner();
        flyableCleaner.clean(new Flyable() {
            @Override
            public void fly() {

            }
        });
        flyableCleaner.clean(()-> System.out.println("Dziendobry"));




        Flyable bird = new Bird();

        Flyable plane = new Flyable() {
            @Override
            public void fly() {
                System.out.println("fly() from plane");
            }
        };

        Flyable bullet = () -> System.out.println("fly() from bullet");


        Moveable moveable2 = () -> System.out.println("run from moveable 2 lambda");
        Swimable swimable = (distance, speed) -> System.out.println("My dist: " + distance + " My Speed: " + speed);

        swimable.swim(25, 36);
        moveable2.run();

        FormulaConverter anotherOne = new FormulaConverter() {
            @Override
            public double fromCelsiusToFahrenheit(double celsius) {
                return 0;
            }


        };

        FormulaConverter formulaConverter = celsius -> (celsius * 9.0/5.0)+32;
        System.out.println(formulaConverter.fromCelsiusToFahrenheit(25));

//        MyLambda myLambda = ilosc -> {for(int i = 0; i < ilosc;  i++){
//
//
//            String wynik;
//
//
//            return wynik; }
//        };


        MyLambda myLambda = new MyLambda() {
            @Override
            public String test(int n) {
                String result = "";
                for(; n>0; n--){
                    result += "SDA";
                }



                return result;
            }


        };
        System.out.println(myLambda.test(25));









    }

}

