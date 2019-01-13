package pl.com.tkarolczyk.solid.open_close_principle.exc.exception;

public class UserNotFoundUncheckedExc extends RuntimeException {


    public UserNotFoundUncheckedExc() {
    }

    public UserNotFoundUncheckedExc(String message) {
        super(message);
    }

    public UserNotFoundUncheckedExc(String message, Throwable cause) {
        super(message, cause);
    }

    public UserNotFoundUncheckedExc(Throwable cause) {
        super(cause);
    }

    public UserNotFoundUncheckedExc(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
