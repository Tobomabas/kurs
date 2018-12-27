package pl.com.tkarolczyk.homeWork;

import java.util.Random;

public class Butelka {

    private int ileLitrów;
    private int capacity;


    public int getIleLitrów() {
        return ileLitrów;
    }
    public int getCapacity(){
        return capacity;
    }

    public void wlej (int ilosc){
        this.ileLitrów += ilosc;
    }
    public void wylej (int ilosc){
        this.ileLitrów -= ilosc;

    }
    public void przelej (int ilosc, Butelka to){
        if (ilosc > this.getIleLitrów()){
            ilosc =  this.getIleLitrów();
        }
        if(to.getCapacity()<to.getCapacity()+ilosc){
            ilosc = to.getCapacity();
        }

        this.wylej(ilosc);
        to.wlej(ilosc);

    }


    public Butelka (){}


    public Butelka (int ileLitrów, int capacity){
        this.ileLitrów = ileLitrów;
        this.capacity = capacity;
    }



    public static void main(String[] args) {
        Butelka[] butelka  = new Butelka[5];
        butelka[0] = new Butelka(10, 25);
        butelka[1] = new Butelka(15, 15);
        butelka[2] = new Butelka(20,200);
        butelka[3] = new Butelka(25,59);
        butelka[4] = new Butelka(30,99);


        butelka[2].wlej(55);
        System.out.println(butelka[2].getIleLitrów());
        butelka[2].przelej(76,butelka[1]);
        System.out.println(butelka[2].getIleLitrów());
        System.out.println(butelka[1].getIleLitrów());



//        Random random = new Random(100);
//
//        for(int i = 0; i<=99; i++){
//            butelka[i] = new Butelka(random.nextInt(100));
//        }
        /*
        Display array of Butelkas
         */
//        for (Butelka d : butelka){
//            System.out.println(d.ileLitrów);
//        }


    }
}
