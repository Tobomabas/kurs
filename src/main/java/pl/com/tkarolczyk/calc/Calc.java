package pl.com.tkarolczyk.calc;

import java.util.Locale;
import java.util.Scanner;

public class Calc {

    private float current;  // float variable that holds current result
    private float next;     // float variable that holds last entered value
    private String actions; // String that holds possible math operators: +, - , *, /
    private String action;  // String that holds last entered math operator
    private Scanner input;  // Scanner object


    // Calc class constructor
    private Calc() {
        this.current = 0;                       // because every calc shows 0 at the begining :)
        this.action = "+";                      // because if you press number on a fresh calc, it show your number
        this.input = new Scanner(System.in);    // new Scanner object with input stream
        this.input.useLocale( Locale.US );      // used to help Scanner read floating numbers separated with '.' (dot)
        this.actions = "+-*/";                  // all possible math operators


    }

    // mathematics behind calculator
    private void math(){
        if (this.action.contains("+")){
            this.current += this.next;
        }
        if (this.action.contains("-")){
            this.current -= this.next;
        }
        if (this.action.contains("*")){
            this.current = this.current * this.next;
        }
        if (this.action.contains("/")){
            this.current = this.current / this.next;
        }
//      this didn't work because of some stupid InteliJ's bug...
//        switch (this.action){
//            case "+": this.current = this.current + this.next;
//            case "-": this.current = this.current - this.next;
//            case "*": this.current = this.current * this.next;
//            case "/": this.current = this.current / this.next;
//        }
    }


    // used to start calcuator and do calculations
    private void start() {

        // prints out 0 to the console along with welcome message
        System.out.println("\nCalculator is running... \nType numbers and math operatorsthis.\n0");
        System.out.print("next: ");

        // do things while there is input
        while (input.hasNext()) {

            // write number to this.next and do math
            if (input.hasNextFloat()) {
                this.next = input.nextFloat();
                math();
            }else if(input.hasNextInt()){
                this.next = (float) input.nextInt();
                math();

                //  else check if input is '=' or one of avalible math operators
            }else{
                String temp = input.next();                         // last entered text is passed to temp variable
                if (temp.contains("=") && temp.length() == 1){      // if '=' is part of temp and if temp has 1 character
                    System.out.println(this.current);               // prints result and break the loop
                    break;
                }else{                                              // else check if temp is one of the math operators
                    if (this.actions.contains(temp) && this.action.length() == 1){
                        this.action = temp;
                    }else{                                          // if temp is not math operator or '=' send a prompt
                        System.out.println("Please, enter number or '+', '-', '*', '/'...");
                    }
                    System.out.print("next: ");
                    continue;                                       // skip rest of the loop and start again
                }
            }

            // displays current result
            System.out.println(this.current);
            System.out.print("next: ");
        }
    }

    // main method
    public static void main(String[] args) {
        Calc kalkulator = new Calc();                               // creates new Calc object
        kalkulator.start();                                         // runs Calc's start() function
    }
}