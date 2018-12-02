package pl.com.tkarolczyk.plant;

public class Cactus extends Plant  {
    public Cactus(int heightInCm, int waterUseInMl, int currentWaterLevelInMl) {
        super(heightInCm, waterUseInMl, currentWaterLevelInMl);
    }


    @Override
    public void grow() {
        heightInCm += 1;

        currentWaterLevelInMl = currentWaterLevelInMl - waterUseInMl;
    }

    @Override
    public String toString() {
        return "Cactus{" +
                "heightInCm=" + heightInCm +
                ", waterUseInMl=" + waterUseInMl +
                ", currentWaterLevelInMl=" + currentWaterLevelInMl +
                '}';
    }
    @Override
    public int getReqiuredWaterIncrease() {
        return 7;

    }


}
