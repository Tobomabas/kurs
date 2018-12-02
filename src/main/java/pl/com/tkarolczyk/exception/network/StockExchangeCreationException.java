package pl.com.tkarolczyk.exception.network;

public class StockExchangeCreationException extends RuntimeException {

    public StockExchangeCreationException() {
    }

    public StockExchangeCreationException(String message) {
        super(message);
    }

    public StockExchangeCreationException(String message, Throwable cause) {
        super(message, cause);
    }
}
