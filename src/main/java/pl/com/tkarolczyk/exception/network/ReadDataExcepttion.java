package pl.com.tkarolczyk.exception.network;

public class ReadDataExcepttion extends RuntimeException {


    public ReadDataExcepttion() {
    }

    public ReadDataExcepttion(String message) {
        super(message);
    }

    public ReadDataExcepttion(String message, Throwable cause) {
        super(message, cause);
    }
}
