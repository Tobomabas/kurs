package pl.com.tkarolczyk.homeWork.constructors;

public class Table extends Furniture {

    static {
        System.out.println("text ze static w Table");
    }
    {
        System.out.println("text z non static w table");
    }

    @Override
    public void color(){
        System.out.println("kolor krzesła jest niebieski");


    }



}
