package pl.com.tkarolczyk.constructor;

public class Main {

    public static void main(String[] args) {

//        Dish myLunch;
//        myLunch = new Dish();
//        Dish myLunch1;
//        myLunch1 = new Dish();
//        Dish myLunch2;
//        Dish myLunch3;

//        System.out.println("------------------");
//
        //Pizza carbonarra = new Pizza();
        //System.out.println("------------------");
      //    Pizza zDodatkami = new Pizza("ser");



       Cutlet cutlet2 = Cutlet.giveMeNewNormalCutletwithaddon("cebula");

        System.out.println(cutlet2.getSkladnik());

        Dish tomek = new Dish();

        System.out.println(tomek);


    }




}
