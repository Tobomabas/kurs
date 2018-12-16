package pl.com.tkarolczyk.homeWork.streamv2;


import java.util.ArrayList;
import java.util.List;

public class Beverage {

    private List<Ingredient> ingredientList = new ArrayList<>();
    private String beverageName;

    public Beverage(String beverageName, List<Ingredient> ingredients){

        this.beverageName = beverageName;
        ingredientList.addAll(ingredients);

    }

    public List<Ingredient> getIngredientList() {
        return ingredientList;
    }
}
