package pl.com.tkarolczyk.plant;

public class Gardener {


    public void waterPlant(Plant plant) {


        plant.increaseWaterLevelInML(2);

    }

    public void makePlantGrow (Plant plant){


        plant.grow();


    }


}
