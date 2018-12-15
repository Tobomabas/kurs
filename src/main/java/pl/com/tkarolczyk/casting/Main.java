package pl.com.tkarolczyk.casting;

public class Main {

    public static void main(String[] args) {

        Object object = new String("String");




        ((String)object).substring(3);
        String string = (String)object;
        string.substring(1);



        Number number = (Number) object;


    }


}
