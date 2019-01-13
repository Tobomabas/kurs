package pl.com.tkarolczyk.solid.open_close_principle;

public class BetterSecret {


    private final String secret;
    private Saver saver;

    public BetterSecret(String secret, Saver saver) {
        this.secret = secret;
        this.saver = saver;
    }

    public void setSaver(Saver saver) {
        this.saver = saver;
    }

    @Override
    public String toString() {
        return "BetterSecret{" +
                "secret='" + secret + '\'' +
                ", saver=" + saver +
                '}';
    }


    public String getSecret() {
        return secret;
    }


    public void save(){
        saver.save(this);


    }

    public Saver getSaver() {
        return saver;
    }
}
