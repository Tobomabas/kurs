package pl.com.tkarolczyk.homeWork.barman;

public class Barman {


    String ingredientOne, ingredientTwo, ingredientThree;
    int ingredientOneAmount, ingredientTwoAmount, ingredientThreeAmount;






    public void createDrink(String a){

        Drink mohito = new Drink(ingredientOne, ingredientTwo, ingredientThree, ingredientOneAmount, ingredientTwoAmount, ingredientThreeAmount);

    }

    public void printDrink(){


    }

    public static void main(String[] args) {

        Drink mohito = new Drink("mleko", "woda", "wódka", 25,25,25);

        System.out.println(mohito.getIngredientOne()+mohito.getIngredientOneAmount());
        System.out.println(mohito);

    }


}
