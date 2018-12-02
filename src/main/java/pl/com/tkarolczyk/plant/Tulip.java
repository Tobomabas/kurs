package pl.com.tkarolczyk.plant;

public class Tulip extends Plant {
    public Tulip(int heightInCm, int waterUseInMl, int currentWaterLevelInMl) {
        super(heightInCm, waterUseInMl, currentWaterLevelInMl);
    }


    @Override
    public void grow() {
        heightInCm += 3;

        currentWaterLevelInMl = currentWaterLevelInMl - waterUseInMl;
    }

    @Override
    public String toString() {
        return "Tulip{" +
                "heightInCm=" + heightInCm +
                ", waterUseInMl=" + waterUseInMl +
                ", currentWaterLevelInMl=" + currentWaterLevelInMl +
                '}';
    }
    @Override
    public int getReqiuredWaterIncrease() {
        return 3;

    }
}
