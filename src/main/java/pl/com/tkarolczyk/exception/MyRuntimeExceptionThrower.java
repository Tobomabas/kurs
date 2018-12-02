package pl.com.tkarolczyk.exception;

public class MyRuntimeExceptionThrower {

    public void throwMyRuntimeException(){

        System.out.println("throwMyExeption");
        throw new MyRuntimeException("HAHHAHH");


    }

}
