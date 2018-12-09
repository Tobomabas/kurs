package pl.com.tkarolczyk.anonymous_classes.null_avoid.optional;

import java.util.Optional;

public class Main {
//    String name = "";

//        String? namewithNull = null;
    public static void main(String[] args) {

//        Sink sink = new Sink("KOLO");
//        House house = new House(null){};
//        House house1 = new House(new Bathroom(null));
//        House house2 = new House(new Bathroom(new Sink(null)));
//        House house3 = new House(new Bathroom(sink));

        Optional<String> maybeString = Optional.empty();
        Optional<String> stringForSure = Optional.of("tomasz karolczyk");



        stringForSure.ifPresent(x -> System.out.println(x));


        String maybeNull = null;
        Optional<String> abstenString = Optional.ofNullable(maybeNull);


//        to samo !!
        abstenString.ifPresent(x -> System.out.println(x));

        if (abstenString.isPresent()) {
            System.out.println(abstenString.isPresent());
        }
//      to samo !!
    }
        private static void printLabelSlowMode(House house){
        String label = "empty";
            Optional<House> maybeHuse = Optional.ofNullable(house);
            if(maybeHuse.isPresent()){
              Optional<Bathroom> maybeBathroom = maybeHuse.get().getBathroom();
              if(maybeBathroom.isPresent()){
                  maybeBathroom.get().getSink();
                  Optional<Sink> maybeSink = maybeBathroom.get().getSink();
                  if(maybeSink.isPresent()){
                      label = maybeSink.get().getLabel();
                  }
            }
        }
            System.out.println(label);

    }


    private static void pritLabelWithLambda(House house){
        Optional.ofNullable(house)
                .flatMap(house1 -> house1.getBathroom())
                .flatMap(bathroom -> bathroom.getSink())
                .map(sink -> sink.getLabel())
                .ifPresent(s -> System.out.println("label: " + s));



    }




}

