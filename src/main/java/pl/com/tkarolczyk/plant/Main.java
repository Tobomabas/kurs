package pl.com.tkarolczyk.plant;

import pl.com.tkarolczyk.enum_example.Days;

public class Main {
    public static void main(String[] args) {
        Plant[] plants = makePlants();
        Gardener jozek = new Bettergardener();

        for(Days weekDay : Days.values()) {
            System.out.println("Days: " +weekDay);

            // for (int i = 0; i < 7; i++) {
            for (Plant plant : plants) {
                jozek.waterPlant(plant);
                jozek.makePlantGrow(plant);
            }
            //}
        }
        for (Plant plant : plants) {
            System.out.println(plant);
        }
    }
    public static Plant[] makePlants() {
        Plant[] result = new Plant[6];
        result[0] = new Cactus(1, 2, 33);
        result[1] = new Cactus(2, 3, 21);
        result[2] = new Rose(3, 3, 10);
        result[3] = new Rose(4, 4, 11);
        result[4] = new Tulip(3, 4, 5);
        result[5] = new Tulip(5, 6, 7);
        return result;
    }
}
