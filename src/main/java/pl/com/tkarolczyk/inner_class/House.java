package pl.com.tkarolczyk.inner_class;

import java.util.ArrayList;
import java.util.List;

public class House {

    List<Apartment> apartments;
    private String houseName;




    public House(String houseName){
        this.houseName = houseName;

        apartments = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            apartments.add(new Apartment(25));
        }

    }
    public House()
    {
        apartments = new ArrayList<>();
    }
    public void addApartment(Apartment apartment){
        apartments.add(apartment);

    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public class Apartment{

        int sizeSquareM;

        public Apartment(int sizeSquareM) {
            this.sizeSquareM = sizeSquareM;
        }

        @Override
        public String toString() {
            return "Apartment{" +
                    "sizeSquareM=" + sizeSquareM +
                    '}';

        }
        public void printNameOfHouse(){
            System.out.println("House name: " + House.this.houseName);
        }

    }


}
