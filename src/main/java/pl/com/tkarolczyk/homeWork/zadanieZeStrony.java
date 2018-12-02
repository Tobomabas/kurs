package pl.com.tkarolczyk.homeWork;

import java.util.Scanner;

public class zadanieZeStrony {

    public static void main(String[] args) {

        int minCandies;

        Scanner inputReader = new Scanner(System.in);
        System.out.println("Podaj ilość dzieci w pierwszej klasie: ");
        int numberOfChilds1 = inputReader.nextInt();
        System.out.println("Podaj ilość dzieci w drugiej klasie: ");
        int numberOfChilds2 = inputReader.nextInt();


       if (numberOfChilds1 < numberOfChilds2)
           minCandies = numberOfChilds1;
       else
           minCandies = numberOfChilds2;

        System.out.println(minCandies);
       for (int i = minCandies; !(((numberOfChilds1 % i) == 0) && ((numberOfChilds2 % i) == 0)); i++) {

           System.out.println(i);


            }




    }}



