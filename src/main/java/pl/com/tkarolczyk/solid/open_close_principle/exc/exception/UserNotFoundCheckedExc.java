package pl.com.tkarolczyk.solid.open_close_principle.exc.exception;

public class UserNotFoundCheckedExc extends Exception {


    public UserNotFoundCheckedExc() {
    //
    }
    public UserNotFoundCheckedExc(String message){
        super(message);
    }
    public UserNotFoundCheckedExc(String message, Throwable cause){
        super(message, cause);


    }

}
