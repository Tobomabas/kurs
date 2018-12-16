package pl.com.tkarolczyk.homeWork.streamv2;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        //skladniki
        Ingredient nuts = new Ingredient("nuts");
        Ingredient carrot = new Ingredient("carrot");
        Ingredient soya = new Ingredient("soya");
        Ingredient milk = new Ingredient("milk");
        Ingredient water = new Ingredient("water");
        Ingredient sugar = new Ingredient("sugar");
        Ingredient salt = new Ingredient("salt");
        //napoje
        Beverage beverage1 = new Beverage("napoj1", Arrays.asList(water, milk, soya, salt));
        Beverage beverage2 = new Beverage("napoj1", Arrays.asList(sugar, milk, nuts, salt));
        Beverage beverage3 = new Beverage("napoj1", Arrays.asList(water, milk, soya, salt));
        Beverage beverage4 = new Beverage("napoj1", Arrays.asList(water, nuts, soya, carrot));
        Beverage beverage5 = new Beverage("napoj1", Arrays.asList(water, sugar, soya, salt));
        //menu
        Menu menu = new Menu();
        menu.addBeverage(beverage1, true);
        menu.addBeverage(beverage2, true);
        menu.addBeverage(beverage3, false);
        menu.addBeverage(beverage4, true);
        menu.addBeverage(beverage5, false);
        //logika



        }
    private static List<Beverage> getNutsFreeBeverages (Menu menu) {
                Ingredient nuts = new Ingredient("nuts");
       List<Beverage> result = new ArrayList<>();
                List<Beverage> withoutNuts = menu.getBeverages()
                .keySet()
                .stream()
                .filter(beverage -> !beverage.getIngredientList().contains(nuts))
                .collect(Collectors.toList());
           Map<Beverage, Boolean> beverageBooleanMap = menu.getBeverages();
        beverageBooleanMap.forEach((beverage, aBoolean) -> {if (aBoolean && withoutNuts.contains(beverage)){

        result.add(beverage);

        }
        });

        return Collections.emptyList();

    }

    }


