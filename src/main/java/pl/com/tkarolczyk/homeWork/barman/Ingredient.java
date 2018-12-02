package pl.com.tkarolczyk.homeWork.barman;

public class Ingredient {

    private String ingredientName;
    private int ingredientAmount;


    public Ingredient(String ingredientName, int ingredientAmount) {
        this.ingredientName = ingredientName;
        this.ingredientAmount = ingredientAmount;
    }
    public Ingredient(){

    }

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    public int getIngredientAmount() {
        return ingredientAmount;
    }

    public void setIngredientAmount(int ingredientAmount) {
        this.ingredientAmount = ingredientAmount;
    }
}
