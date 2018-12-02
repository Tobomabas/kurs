package pl.com.tkarolczyk.string_tests;

public class StringBuilderTest {

    public static void main(String[] args) {
        //StringBuilder name = new StringBuilder("Tomek");
        //StringBuilder newName = new StringBuilder();

      //  newName.append("to");
      //  newName.append(" jest");
       // newName.append(" czlowiek");

       // System.out.println(newName);

        StringBuilder nameName = new StringBuilder();
        nameName.append("abc").append(" def").append(" ghi");

        nameName.replace(4, 7, "niema");
        System.out.println(nameName);

        String Tomasz;


    }
}
