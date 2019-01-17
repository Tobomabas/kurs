package pl.com.tkarolczyk.garbage_collector;

public class FeaturePhone {

    private String model;
    private int[] a = new int[155_000];

    public FeaturePhone(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FeaturePhone that = (FeaturePhone) o;

        return model != null ? model.equals(that.model) : that.model == null;
    }



    @Override
    public String toString() {
        return "FeaturePhone{" +
                "model='" + model + '\'' +
                '}';
    }
}

