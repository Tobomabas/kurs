package pl.com.tkarolczyk.anonymous_classes.null_avoid;

import java.util.Optional;

public class Main {
    String name = "";

    //    String? namewithNull = null;
    public static void main(String[] args) {

        Sink sink = new Sink("KOLO");
      //  House house = new House(null) {        };
    //    House house1 = new House(new Bathroom(null));
     //   House house2 = new House(new Bathroom(new Sink(null)));
        House house3 = new House(new Bathroom(sink));

    //    diisplaySingLabel(house3);
        printLabelWithLmbda2(house3);
    }

    static private void diisplaySingLabel(House house) {
        String label = house.getBathroom().getSink().getLabel();
//        String labe2 = house?.getBathroom()?.getSink().getLabel();   <-< rozwiązanie z Kotlina i Grooviego
        System.out.println(label);
    }

    static private void betterDisplaySinkLabel(House house) {
        String label = "default";
        if (null != house) {
            Bathroom bathroom = house.getBathroom();

            if (null != bathroom) {
                Sink sink = bathroom.getSink();

                if (null != sink) {
                    label = sink.getLabel();
                }
            }
        }


        System.out.println(label);

    }
private static void printLabelWithLmbda2(House house){

    Optional.ofNullable(house)
            .map(House::getBathroom)
            .map(Bathroom::getSink)
            .map(Sink::getLabel)
            .ifPresent(s -> System.out.println("label: " + s));
}


}
