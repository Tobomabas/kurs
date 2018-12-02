package pl.com.tkarolczyk.Interface_example;


import javafx.print.PageLayout;

public class Plane implements Flyeble {


    String type;
    int maxLoad;

    public Plane (String type, int maxLoad){
        this.type = type;
        this.maxLoad = maxLoad;

    }


    @Override
    public String fly() {
        return "ksdmcksmckmc";

        //System.out.println(a);
    }



}







