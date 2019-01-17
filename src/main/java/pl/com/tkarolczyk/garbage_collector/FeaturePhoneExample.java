package pl.com.tkarolczyk.garbage_collector;
import java.util.HashSet;
import java.util.Set;
public class FeaturePhoneExample {
    public static void main(String[] args) {
        Set<FeaturePhone> featurePhoneSet = new HashSet<>();
        FeaturePhone featurePhone1 = new FeaturePhone("Nokia1");
        FeaturePhone featurePhone2 = new FeaturePhone("Nokia1");
        System.out.println(featurePhone1.equals(featurePhone2));
        featurePhoneSet.add(featurePhone1);
        featurePhoneSet.add(featurePhone2);
        test(featurePhoneSet, featurePhone2);

        System.out.println(featurePhoneSet.size());
    }
    public static void test (Set featurePhone, FeaturePhone featurePhone2){
        while (1==1)
        {

            featurePhone.add(new FeaturePhone("55"));
        }
    }


}
