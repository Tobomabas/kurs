package pl.com.tkarolczyk.exception.network;

import java.util.Random;

public class StockExchange {


    public StockExchange() {
        Random t = new Random();
        int a = t.nextInt(100);
        if (a % 2 == 1) {
            throw new StockExchangeCreationException(".....StockExchangeCreationException.....");
        }
    }
    //ReadDataExcepttion
    //constructor StockExchangeCreationException
    //Random - % 2
    public String readData() throws ReadDataExcepttion {
        Random t = new Random();
        int a = t.nextInt(100);


        if (a % 2 == 1) {
            throw new ReadDataExcepttion("...ReadDataException....");

        }
        return "UDAO SIE CO SIE STAO !! :)";
    }

    public static void main(String[] args) {
        StockExchange t = new StockExchange();
        String readData = null;
        try{t.readData();
            System.out.println("after");
        }catch (ReadDataExcepttion exc){
            readData = "";
        }finally {
            System.out.println("here");
        }

    }
}






