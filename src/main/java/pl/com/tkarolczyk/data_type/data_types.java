package pl.com.tkarolczyk.data_type;

public class data_types {

    public static void main(String[] args) {

        short c = 0;
        Short cShort = 0;
        System.out.println("MAX short: " + Short.MAX_VALUE);
        System.out.println("MIN short: " + Short.MIN_VALUE);

        byte d = (byte) 127;
        System.out.println(d);
        Byte dByte = 0;
        System.out.println("MAX byte: " + Byte.MAX_VALUE);
        System.out.println("MIN byte: " + Byte.MIN_VALUE);



        int a = 5 + 8; // 4 bajty
        Integer aInteger = 5 + 8;

        System.out.println(aInteger);
        System.out.println(a);
        System.out.println("MAX int: " + Integer.MAX_VALUE);
        System.out.println("MIN int: " + Integer.MIN_VALUE);
        long b = 5 + 8; // 8 bajtów
        Long bLong =  5L + 8L;
        System.out.println("MIN long: " + Long.MIN_VALUE);
        System.out.println("MAX long: " + Long.MAX_VALUE);

        System.out.println("---------------------------------");
        float f = 3.11f;
        System.out.println("MAX float: " + Float.MIN_VALUE);
        System.out.println("MIN float: " + Float.MAX_VALUE);
        double db = 3.11;
        System.out.println("MAX Double: " + Double.MIN_VALUE);
        System.out.println("MAX Double: " + Double.MAX_VALUE);

        boolean trueOrFalse = false;
        trueOrFalse = true;

        Boolean bBolean = true;
        bBolean = false;
        bBolean = null;
        System.out.println("---------------------------------");
        char litteChar = 'a';
        litteChar = 'b';
        Character lCHaracter = 'd';
        System.out.println("MAX char: " + (int)Character.MIN_VALUE);
        System.out.println("MAX char: " + (int)Character.MAX_VALUE);







    }
}
