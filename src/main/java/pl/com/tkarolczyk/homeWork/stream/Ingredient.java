package pl.com.tkarolczyk.homeWork.stream;

public class Ingredient {
    private Soya soya;
    private Milk milk;
    private Nuts nuts;

    public Ingredient(Soya soya, Milk milk, Nuts nuts) {
        this.soya = soya;
        this.milk = milk;
        this.nuts = nuts;
    }

    public Soya getSoya() {
        return soya;
    }

    public void setSoya(Soya soya) {
        this.soya = soya;
    }

    public Milk getMilk() {
        return milk;
    }

    public void setMilk(Milk milk) {
        this.milk = milk;
    }

    public Nuts getNuts() {
        return nuts;
    }

    public void setNuts(Nuts nuts) {
        this.nuts = nuts;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "soya=" + soya +
                ", milk=" + milk +
                ", nuts=" + nuts +
                '}';
    }
}
