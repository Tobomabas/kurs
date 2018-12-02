package pl.com.tkarolczyk.homeWork.barman;

public class Drink {

    private String ingredientOne;
    private String ingredientTwo;
    private String ingredientThree;
    private int ingredientOneAmount;
    private int ingredientTwoAmount;
    private int ingredientThreeAmount;

    public Drink(String ingredientOne, String ingredientTwo, String ingredientThree, int ingredientOneAmount, int ingredientTwoAmount, int ingredientThreeAmount) {
        this.ingredientOne = ingredientOne;
        this.ingredientTwo = ingredientTwo;
        this.ingredientThree = ingredientThree;
        this.ingredientOneAmount = ingredientOneAmount;
        this.ingredientTwoAmount = ingredientTwoAmount;
        this.ingredientThreeAmount = ingredientThreeAmount;
    }

    public String getIngredientOne() {
        return ingredientOne;
    }

    public void setIngredientOne(String ingredientOne) {
        this.ingredientOne = ingredientOne;
    }

    public String getIngredientTwo() {
        return ingredientTwo;
    }

    public void setIngredientTwo(String ingredientTwo) {
        this.ingredientTwo = ingredientTwo;
    }

    public String getIngredientThree() {
        return ingredientThree;
    }

    public void setIngredientThree(String ingredientThree) {
        this.ingredientThree = ingredientThree;
    }

    public int getIngredientOneAmount() {
        return ingredientOneAmount;
    }

    public void setIngredientOneAmount(int ingredientOneAmount) {
        this.ingredientOneAmount = ingredientOneAmount;
    }

    public int getIngredientTwoAmount() {
        return ingredientTwoAmount;
    }

    public void setIngredientTwoAmount(int ingredientTwoAmount) {
        this.ingredientTwoAmount = ingredientTwoAmount;
    }

    public int getIngredientThreeAmount() {
        return ingredientThreeAmount;
    }

    public void setIngredientThreeAmount(int ingredientThreeAmount) {
        this.ingredientThreeAmount = ingredientThreeAmount;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "ingredientOne='" + ingredientOne + '\'' +
                ", ingredientTwo='" + ingredientTwo + '\'' +
                ", ingredientThree='" + ingredientThree + '\'' +
                ", ingredientOneAmount=" + ingredientOneAmount +
                ", ingredientTwoAmount=" + ingredientTwoAmount +
                ", ingredientThreeAmount=" + ingredientThreeAmount +
                '}';
    }
}
