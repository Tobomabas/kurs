package pl.com.tkarolczyk.homeWork.MaxMin;

import java.util.Scanner;

public class maxMin {


    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        int a = inputReader.nextInt();
        int b = inputReader.nextInt();
        int c = inputReader.nextInt();

    int max = getMax(a, b, c);
    int min = getMin(a, b, b);

        System.out.println("max to: " + max);
        System.out.println("min to: " + min);
    }

    public static int getMax(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
    public static  int getMin(int a, int b, int c){
        int min = a;
        if (b < min){
            min = b;
        }
        if (c < min){
            min = c;

        }

        return min;


    }


}
