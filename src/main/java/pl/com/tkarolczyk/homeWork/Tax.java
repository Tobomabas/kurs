package pl.com.tkarolczyk.homeWork;

import java.util.Scanner;

public class Tax {


    public static void main(String[] args) {

        Scanner inputReader = new Scanner(System.in);
        System.out.println("Podaj dochód: ");
        double income = inputReader.nextDouble();
        System.out.println("Podałes dochód: " + income);
        System.out.println("Nalżny podatek to: " + tax(income));


    }


    public static double tax (double income){

        double result;



        if (income <= 85.528){

            result = income*0.18-556.02;

        }
        else{
            result = 14.839 + 0.32*(income-85.528);
        }

        return result;

    }


}
