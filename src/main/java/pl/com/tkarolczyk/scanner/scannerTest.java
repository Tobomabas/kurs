package pl.com.tkarolczyk.scanner;

import java.util.Scanner;
import java.lang.*;

public class scannerTest {
    public static void main(String[] args) {

        Scanner inputReader = new Scanner(System.in);
        System.out.println("Podaj wartość 1 ");
        int a = inputReader.nextInt();
        System.out.println("Podaj wartosc 2 ");
        int b = inputReader.nextInt();
        System.out.println("Podaj wartosc 3 ");
        int c = inputReader.nextInt();


        int iloczyn = (a * b * c);
        System.out.println("iloczyn iczb to: " + iloczyn);


        for (; inputReader.hasNext(); ) {
            if (inputReader.hasNextInt()) {
                System.out.println(inputReader.next());
            } else {
                inputReader.next();
            }

        }


    }
}
