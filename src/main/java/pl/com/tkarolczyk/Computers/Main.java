package pl.com.tkarolczyk.Computers;

import static pl.com.tkarolczyk.Computers.Laptop.dupa;

public class Main {


    public static void main(String[] args) {

        Computer computer = new Computer();
        Computer laptop = new Laptop();
        Computer pc = new PC();
        Computer tablet = new Tablet();
        PC tomek = new PC();

        computer.changeDrive();
        laptop.changeDrive();
        pc.changeDrive();
        tablet.changeDrive();


        System.out.println("----------------------------");

        changeDrive(computer);
        changeDrive(laptop);
        changeDrive(pc);
        changeDrive(tablet);
        burnyourself2(tomek);

        }

    public static void changeDrive(Computer computer){

        computer.changeDrive();
        computer.burnYourself();

    }
    public static void burnyourself2(PC pc){
        pc.burnyourself2();


        System.out.println(dupa);
    }




}
