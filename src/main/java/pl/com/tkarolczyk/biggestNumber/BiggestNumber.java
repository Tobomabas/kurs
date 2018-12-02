package pl.com.tkarolczyk.biggestNumber;


import java.util.Collections;
import java.util.Scanner;

public class BiggestNumber {


    public static void main(String[] args) {

//        Scanner enterValue = new Scanner(System.in);
//        System.out.println("Podaj pierwszą liczbe:");
//        int val1 = enterValue.nextInt();
//        System.out.println("Podaj drugą liczbe:");
//        int val2 = enterValue.nextInt();
//        System.out.println("Podaj trzecią liczbe:");
//        int val3 = enterValue.nextInt();
//
//        if (val1 > val2) {
//            if (val1 > val3) {
//                System.out.println("Największa liczba: " + val1);
//            } else if (val2 > val3) {
//                 System.out.println("Największa liczba: " + val2);
//            } else {
//                System.out.println("Największa liczba: " + val3);
//            }
//        }
//        int a = 10;
//        int b = 11;
//        int c = 12;
//        int d = 13;
//
//      int max = Collections.max(Arrays.asList(a, b, c, d));
//
//        System.out.println(max);
//
        Scanner inputReader = new Scanner(System.in);
        int a = inputReader.nextInt();
        int b = inputReader.nextInt();
        int c = inputReader.nextInt();
        int d = inputReader.nextInt();

        int max = findMax(a, b, c, d);
        System.out.println("Found max: " + max);
        int min = findMin(a, b, c ,d);
        System.out.println("Found min: " + min);
    }

    public static int findMax ( int d, int e, int f, int g){

        int max = d;

        if (e > max){
            max = e;
        }
        if (f > max){
            max = f;
        }
        if (g > max){
            max = g;
        }

        return max;
    }
    public static int findMin ( int a, int b, int c, int d){

        int min = a;

        if (b < min){
            min = b;
        }
        if (c < min){
            min = c;
        }
        if (d < min){
            min = d;
        }

        return min;
    }

}
