package pl.com.tkarolczyk.solid.open_close_principle;

public class Secret {

    private String secret;
    private String path;


    public void setSecret(String secret) {
        this.secret = secret;

    }

    @Override
    public String toString() {
        return "Secret{" +
                "secret='" + secret + '\'' +
                "path='" + path + '\'' +
                '}';
    }

    public Secret(String secret, String path) {
        this.secret = secret;
        this.path = path;
    }

    public void save(){

        System.out.println(String.format("saving secret to file: [%s]", path));




    }


}
