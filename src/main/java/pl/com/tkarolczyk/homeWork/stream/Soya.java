package pl.com.tkarolczyk.homeWork.stream;

public class Soya {

    int amount;

    @Override
    public String toString() {
        return "Soya{" +
                "amount=" + amount +
                '}';
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Soya(int amount) {
        this.amount = amount;
    }
}
