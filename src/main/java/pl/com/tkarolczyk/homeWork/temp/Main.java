package pl.com.tkarolczyk.homeWork.temp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inputReader = new Scanner(System.in);
        System.out.println("Podaj stopnie celcjusza: ");
        int celcVal = inputReader.nextInt();

        double fahrVal = (double)celcVal * 9/5+32;

        System.out.println(celcVal+ " Stopni celciusza w fahrenhatach to: " + fahrVal);
    }



}
