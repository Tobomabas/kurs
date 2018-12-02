package pl.com.tkarolczyk.plant;

public class Bettergardener extends Gardener{



    public void waterPlant(Plant plant) {


        plant.increaseWaterLevelInML(plant.getReqiuredWaterIncrease());

    }

}

