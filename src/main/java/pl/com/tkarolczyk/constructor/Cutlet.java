package pl.com.tkarolczyk.constructor;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class Cutlet {

    private String skladnik;



    private Cutlet(String skladnik){
        this.skladnik = skladnik;


    }

    public String getSkladnik() {
        return skladnik;
    }

    public void setSkladnik(String skladnik) {
        this.skladnik = skladnik;
    }

    @NotNull
    @Contract("_ -> new")
    public static Cutlet giveMeNewNormalCutletwithaddon(String skladnik){

        return new Cutlet(skladnik);



    }



}
