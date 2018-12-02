package pl.com.tkarolczyk.exception;

public class TestThrowLevel {

    public static void main(String[] args) {
        ThrowLevel2 throwLevel2 = new ThrowLevel2();
        try {
            throwLevel2.doIt();
        } catch (MyException e) {
            e.printStackTrace();
        }

    }
}
