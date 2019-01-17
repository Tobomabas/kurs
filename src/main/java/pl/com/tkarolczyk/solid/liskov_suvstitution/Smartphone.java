package pl.com.tkarolczyk.solid.liskov_suvstitution;

public class Smartphone extends FeaturePhone {


    public Smartphone(String model) {
        super(model);

    }

    @Override
    public String toString() {
        return super.toString();
    }
    protected boolean canBeEqual (){return true;}
    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}


