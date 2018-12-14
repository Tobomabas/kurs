package pl.com.tkarolczyk.homeWork.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
//    Mariusz [10:46 AM]
//    Napiszcie proszę któtki programik który za pomocą stream'a wypisuje tylko te napoje na
//    które jest promocja i jednocześnie w swoim składzie nie zawierają.. orzechów:)
//

    public static void main(String[] args) {
        Drink drink = new Drink(new Ingredient(new Soya(25), new Milk(), new Nuts()), true);



        List<Drink> drinks = Arrays.asList(
                new Drink(new Ingredient(new Soya(25), new Milk(), new Nuts()), true),
                new Drink(new Ingredient(new Soya(0), new Milk(), new Nuts()), false),
                new Drink(new Ingredient(new Soya(0), new Milk(), new Nuts()), true),
                new Drink(new Ingredient(new Soya(11), new Milk(), new Nuts()), true),
                new Drink(new Ingredient(new Soya(33), new Milk(), new Nuts()), true),
                new Drink(new Ingredient(new Soya(25), new Milk(), new Nuts()), true),
                new Drink(new Ingredient(new Soya(25), new Milk(), new Nuts()), true)
        );
        System.out.println(getDrinkInpromotionWithoutSoya(drinks, drink1 -> drink1.getIngredient().getSoya().getAmount()==0));// Czy Mariusz moze rozwinac krok po kroku te lambde
    }

    private static List<Drink> getDrinkInpromotionWithoutSoya(List<Drink>drinks, Predicate <Drink> predicate){
        //List<Drink> result = new ArrayList<>();

        return drinks.stream()
//                .filter(drink -> drink.isPromotion() == true)
//                .map(drink -> drink.getIngredient())
//                .map(ingredient -> ingredient.getSoya())
//                .filter(soya -> soya.getAmount()<0)
//                .collect(Collectors.toList());

        .filter(drink -> drink.isPromotion()==true)
                .filter(predicate)
                .collect(Collectors.toList());
    }


}
//drink -> drink.getIngredient().getSoya().getAmount()==0