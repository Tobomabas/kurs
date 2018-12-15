package pl.com.tkarolczyk.homeWork.stream;

public class Drink {

    private Ingredient ingredient;
    private boolean promotion;

    public Drink(Ingredient ingredient, boolean promotion) {
        this.ingredient = ingredient;
        this.promotion = promotion;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public boolean isPromotion() {
        return promotion;
    }

    public void setPromotion(boolean promotion) {
        this.promotion = promotion;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "ingredient=" + ingredient +
                ", promotion=" + promotion +
                '}';
    }
}



