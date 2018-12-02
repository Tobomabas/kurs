package pl.com.tkarolczyk.homeWork;

import java.util.Scanner;

public class bmi {

    public static void main(String[] args) {

        Scanner inputReader = new Scanner(System.in);
        System.out.println("podaj mase");
        int a = inputReader.nextInt();
        System.out.println("podaj wzrost");
        int b = inputReader.nextInt();


        double bmi = findBMI(a, b);

        System.out.println("twoje BMI to: " + bmi);
        if (bmi > 18.5 && bmi < 25.4) {

            System.out.println("waga ok");
        } else if (bmi < 18.5) {
            System.out.println("niedowaga");
        } else {
            System.out.println("nadwaga");
        }


    }



    public static double findBMI(int mass, float height) {
        float bmi;
        height = height / 100;
        bmi = mass / (height * height);

        return bmi;
    }

}
