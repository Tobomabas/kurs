package pl.com.tkarolczyk.solid.liskov_suvstitution;

public class Main {

    public static void main(String[] args) {

        final String nokia ="Nokia";


        FeaturePhone featurePhone = new FeaturePhone(nokia);
        Smartphone smartphone = new Smartphone(nokia);


        System.out.println(featurePhone.equals(smartphone));
        System.out.println(smartphone.equals(featurePhone));

    }
}
