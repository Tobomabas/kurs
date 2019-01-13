package pl.com.tkarolczyk.solid.open_close_principle;

public interface Saver<T> {

    void save(T secret);


}
