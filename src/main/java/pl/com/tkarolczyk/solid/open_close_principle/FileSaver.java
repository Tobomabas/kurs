package pl.com.tkarolczyk.solid.open_close_principle;

public class FileSaver implements Saver<BetterSecret> {
    @Override
    public void save(BetterSecret secret) {
        System.out.println("saved to File");

    }
}
