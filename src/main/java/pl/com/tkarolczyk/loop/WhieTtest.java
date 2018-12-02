package pl.com.tkarolczyk.loop;

import java.util.Scanner;

public class WhieTtest {



    private int a = 5;
    public int getA(){
        return a;
    }

    public static void main(String[] args) {

        new WhieTtest().getA();

    printNumbers();

//
//        char t = 'a';
//        Scanner enterValue = new Scanner(System.in);
//        System.out.println("Podaj pierwszą liczbe:");
//        t = enterValue.next().charAt(0);
//        while (t != 'r'){
//            Scanner enterValue2 = new Scanner(System.in);
//            System.out.println("Podaj pierwszą liczbe:");
//            t = enterValue2.next().charAt(0);
//        }

//        Scanner enterValue = new Scanner(System.in);
//
//        for (char c = 'r'; c != 'r'; c = enterValue.next().charAt(0)){
//            System.out.println("Podaj znak: ");
//
//        do {}
//        while (t != 'r');





    }


    public static void printNumbers(){
        //100
        for(int i = 1; i <= 100; i++){
            if (i<51){
                System.out.println("i: " +i);
            }
            else {
                break;
            }
        }
    }

}

