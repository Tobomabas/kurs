package pl.com.tkarolczyk.anonymous_classes.lambda.newExcercise;

public class Main {


    public static void main(String[] args) {
        Singer singer = new Singer();
        Singing singing = () -> {};
        singing.bass();

        singer.sing(() -> System.out.println("sing sing!!"));


        Singing singer1 = new Singing() {
            @Override
            public void bass() {
            }
            @Override
            public void sopran() {
                System.out.println("tomasz karolczyk"); //napisana metoda Default
            }
            @Override
            public void middle() {
                System.out.println("tomasz karolczyk"); //napisana metoda Default
            }
        };


    }


}



