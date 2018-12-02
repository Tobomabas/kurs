package pl.com.tkarolczyk.Computers;

public class Laptop extends Computer {




    public static final int dupa = 10;


    @Override
    public void changeDrive(){

        System.out.println("changeDrive() from Laptop");

    }
    public static void burnYourself(){

        System.out.println("burnYourself() form Laptop ");

    }
}
