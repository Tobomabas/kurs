package pl.com.tkarolczyk.exception;

public class ExceptionExample {

    public static void main(String[] args) throws MyException {

    MyExceptionThrower myExceptionThrower = new MyExceptionThrower();
        try {
            myExceptionThrower.throwMyException();
            System.out.println("here");
        } catch (MyException e) {
            e.printStackTrace();
        }
        System.out.println("here 2");

    }

}
