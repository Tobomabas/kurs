package pl.com.tkarolczyk.solid.liskov_suvstitution;

public class FeaturePhone {

    private String model;
    private int[] a = new int[155_000];

    public FeaturePhone(String model) {
        this.model = model;
    }
    protected boolean canBeEqual()
    {return false;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(!(o instanceof FeaturePhone))
        return false;
        //if (o == null || getClass() != o.getClass()) return false;
        FeaturePhone that = (FeaturePhone) o;
        if(!that.canBeEqual())
        {return false;}

        return model != null ? model.equals(that.model) : that.model == null;
    }

    @Override
    public String toString() {
        return "FeaturePhone{" +
                "model='" + model + '\'' +
                '}';
    }

    public String getModel() {
        return model;
    }
}

