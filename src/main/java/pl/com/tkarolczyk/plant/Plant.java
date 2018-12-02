package pl.com.tkarolczyk.plant;

public class Plant {


        protected int heightInCm;
        protected int waterUseInMl;
        protected int currentWaterLevelInMl;


        public Plant (int heightInCm, int waterUseInMl, int currentWaterLevelInMl){

            this.heightInCm = heightInCm;
            this.waterUseInMl = waterUseInMl;
            this.currentWaterLevelInMl = currentWaterLevelInMl;

        }


    public int getHeightInCm() {
        return heightInCm;
    }

    public void setHeightInCm(int heightInCm) {
        this.heightInCm = heightInCm;
    }

    public int getWaterUseInMl() {
        return waterUseInMl;
    }

    public void setWaterUseInMl(int waterUseInMl) {
        this.waterUseInMl = waterUseInMl;
    }

    public void grow() {
            //empty
    }
    public void increaseWaterLevelInML(int waterInML){

            currentWaterLevelInMl += waterInML;

    }
    public int getReqiuredWaterIncrease(){

            return 5;


    }


}
