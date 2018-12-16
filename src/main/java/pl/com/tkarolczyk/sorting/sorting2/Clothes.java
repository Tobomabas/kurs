package pl.com.tkarolczyk.sorting.sorting2;

public class Clothes {

    String owner;
    String type;


    public Clothes(String owner, String type) {
        this.owner = owner;
        this.type = type;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "owner='" + owner + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
