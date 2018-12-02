package pl.com.tkarolczyk.conditional;

import java.util.Scanner;
import java.lang.*;

public class ConditionsTest {

    public static void main(String[] args) {

       // printStringLength("ala");
     //   String value = "ala ma kota";

        String test = null;
        testStringLength(null);
        testStringLength(test);

        Scanner getAge = new Scanner(System.in);

        System.out.println("Podaj wiek: ");
        int age = getAge.nextInt();

        if (age > 0) {

            if (age <= 10) {
                System.out.println("wiek od 0 do 10");
            } else if (age <= 15) {
                System.out.println("wiek od 11 do 15");
            } else if (age <= 18) {
                System.out.println("wiek od 15 do 18");
            } else System.out.println("wiek powyzej 18");

        }
        else {
            System.out.println("jeszcze sie nie urodziłes");
        }
    }


    public static void testAge(int age) {

        if (age <= 10) {
            System.out.println("wiek od 0 do 10");
        } else if (age <= 15) {
            System.out.println("wiek od 11 do 15");
        } else if (age <= 18) {
            System.out.println("wiek od 15 do 18");
        } else System.out.println("wiek powyzej 18");

    }

    public static void printStringLength(String string) {
        int stringLenght = string.length();
        System.out.println("String length: " + stringLenght);

    }



        public static void testStringLength (String string) {
        if ( null !=string && string.length() < 10){
            System.out.println("quite short string");
        }

                }


}




