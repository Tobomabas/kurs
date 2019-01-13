package pl.com.tkarolczyk.solid.open_close_principle;

public class CloudSaver implements Saver<BetterSecret> {
    @Override
    public void save(BetterSecret secret) {
        System.out.println("Saved to cloud!");
    }
}
