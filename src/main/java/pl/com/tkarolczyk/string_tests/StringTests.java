package pl.com.tkarolczyk.string_tests;

import javax.lang.model.SourceVersion;
import javax.lang.model.element.NestingKind;

public class StringTests {

    public static void main(String[] args) {

        String name = "Tomek";
        String theSame = name;
        String secondName = new String("Mariusz");
        String surname = "Karolczyk";
        System.out.println("My name is: " + name );
        System.out.println("My surname is: " + surname );
        System.out.println("Surname, number of lettr is: " + surname.length());

        System.out.println("trzecia litera nazwiska to: " + surname.charAt(2));
       // za duzy index ktory przerwie wykonywanie programu ! System.out.println("trzecia litera nazwiska to: " + surname.charAt(102));
        System.out.println("trzecia litera nazwiska to: " + surname.charAt(4));
        System.out.println("--------------------------------------");
        // System.out.println("My new surname: " + surname.substring(5));
        System.out.println(surname.substring(5,surname.length()-1));

        String newTheSame = theSame.replace('T', 'o');
        System.out.println(newTheSame);
        System.out.println("name:" + name);
        System.out.println("theSame:" + theSame.replace('T', 'o'));
        System.out.println(theSame);


        System.out.println(5 + 6);
        System.out.println("5+6: " + (5 + 6));
        System.out.println((5 + 6) + " - 5+6:");
        System.out.println("J" + 7);
        System.out.println('J' + 7);
        System.out.println((int)'J');










    }
}
