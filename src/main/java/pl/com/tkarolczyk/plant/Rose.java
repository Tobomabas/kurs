package pl.com.tkarolczyk.plant;

public class Rose extends Plant {


    public Rose(int heightInCm, int waterUseInMl, int currentWaterLevelInMl) {
        super(heightInCm, waterUseInMl, currentWaterLevelInMl);
    }

    public void grow() {

        heightInCm += 5;
        currentWaterLevelInMl = currentWaterLevelInMl - waterUseInMl;

    }

    @Override
    public String toString() {
        return "Rose{" +
                "heightInCm=" + heightInCm +
                ", waterUseInMl=" + waterUseInMl +
                ", currentWaterLevelInMl=" + currentWaterLevelInMl +
                '}';
    }

    @Override
    public int getReqiuredWaterIncrease() {
        return 5;

    }
}
