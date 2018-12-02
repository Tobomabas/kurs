package pl.com.tkarolczyk.exception;

public class MyRuntimeExceptionTest {
    static int counter = 1;

    public static void main(String[] args) {
        try {
            level1();
        } catch (MyRuntimeException exc) {
            exc.printStackTrace();
        }

    }

    public static void level1() throws MyRuntimeException {
        level2();

    }

    public static void level2() throws MyRuntimeException {
        level3();

    }

    public static int level3() throws MyRuntimeException {

        throw new MyRuntimeException("My Runtime ");

    }


}
