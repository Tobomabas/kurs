package pl.com.tkarolczyk.inner_class;

public class HouseTest {
    public static void main(String[] args) {

        House vistulaHouse = new House("Domy nad wisłą");
        House.Apartment myNewApartment22 = vistulaHouse.new Apartment (25);
        House.Apartment myNewApartment23 = vistulaHouse.new Apartment (25);
        House.Apartment myNewApartment24 = vistulaHouse.new Apartment (25);
        myNewApartment22.printNameOfHouse();
        myNewApartment23.printNameOfHouse();
        myNewApartment24.printNameOfHouse();




        House oderHouse = new House();
        oderHouse.setHouseName("Domy nad odrą");
        House.Apartment myNewAparatament = oderHouse.new Apartment(150);
        House.Apartment myNewAparatament1 = oderHouse.new Apartment( 50);
        House.Apartment myNewAparatament2 = oderHouse.new Apartment(29);
        myNewAparatament.printNameOfHouse();
        myNewAparatament1.printNameOfHouse();
        myNewAparatament2.printNameOfHouse();



        House wartaHouse = new House();
        wartaHouse.setHouseName("Domy nad Wartą !!");
        House.Apartment myNewAparatament111 = wartaHouse.new Apartment(150);
        House.Apartment myNewAparatament1222 = wartaHouse.new Apartment( 50);
        House.Apartment myNewAparatament3332 = wartaHouse.new Apartment(29);
        myNewAparatament111.printNameOfHouse();
        myNewAparatament1222.printNameOfHouse();
        myNewAparatament3332.printNameOfHouse();











    }


}
