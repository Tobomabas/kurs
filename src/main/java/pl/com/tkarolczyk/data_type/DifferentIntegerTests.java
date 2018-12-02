package pl.com.tkarolczyk.data_type;

import pl.com.tkarolczyk.classees.People;

public class DifferentIntegerTests {

    public static void main(String[] args) {

        int base10 = 15;

        System.out.println(base10);

        int base8  = 015;
        System.out.println(base8);
        int base16 = 0X15;
        System.out.println(base16);
        int base2 = 0b11;
        System.out.println(base2);


        int bigInt = 123_456;// twarde spacje są pomijane w celu przejżysośći

        People Edek = new People("Edward", "Nożycoręki", 33, "biały");
        System.out.println(Edek.getName() + " " + Edek.getSurname() + " ");



    }
}
