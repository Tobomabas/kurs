package pl.com.tkarolczyk.package_test;


import pl.com.tkarolczyk.package_test.one.speaker;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        speaker one = new speaker();
        speaker two = new speaker();
        speaker three = new speaker();

        one.speak();
        two.speak();
        three.speak();


        Date tomas = new Date();
        java.sql.Date tomas2 = new java.sql.Date(252525);


    }


}
