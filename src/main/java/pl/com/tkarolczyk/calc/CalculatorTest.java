package pl.com.tkarolczyk.calc;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {

        for (char EndQuestion = 'y'; EndQuestion == 'y'; ) {

            int result;
            Scanner enterValue = new Scanner(System.in);
            System.out.println("Podaj pierwszą liczbe:");
            int value1 = enterValue.nextInt();
            System.out.println("Jakie chcesz wykonać działanie:");
            char znak = enterValue.next().charAt(0);
            System.out.println("Podaj drugą liczbę liczbe:");
            int value2 = enterValue.nextInt();

            if (znak == '+') {
                result = value1 + value2;
                System.out.println("Result: " + result);
            } else if (znak == '-') {
                result = value1 - value2;
                System.out.println("Result: " + result);
            } else if (znak == '*') {
                result = value1 * value2;
                System.out.println("Result: " + result);
            } else if (znak == '/') {

                double wynikDzielenia = (double) value1 / (double) value2;
                System.out.println("Result: " +  wynikDzielenia);
            }
            System.out.println("Czy chcesz kontynuwać ?? (y/n)");
            EndQuestion = enterValue.next().charAt(0);
        }
    }
}
