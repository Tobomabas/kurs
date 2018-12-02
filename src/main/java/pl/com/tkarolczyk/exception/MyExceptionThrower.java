package pl.com.tkarolczyk.exception;

public class MyExceptionThrower {

    public void throwMyException() throws MyException{
//        throw new MyException();
        System.out.println("throwMyExeption");
        throw new MyException("hahahahah");


    }

}
