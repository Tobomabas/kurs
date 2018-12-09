//package pl.com.tkarolczyk.anonymous_classes.null_avoid.football;
//
//
////FootballClub -> Stadion -> Chairs -> Number
////FootbalClub nie jest nullem
//
//import java.util.Optional;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        FootballClub footballClub = new FootballClub(new Stadion(new Chair(25)));
//
//        System.out.println("numer siedzenia to: " + printNumberOfChair2(footballClub));
//        printNumberOfChair(footballClub);
//    }
//
//    private static void printNumberOfChair(FootballClub footballClub){
//
//        Optional.ofNullable(footballClub)
//        .map(FootballClub::getStadion)
//                .map(Stadion::getChair)
//             //   .map(Chair::getNumber)
//        .ifPresent(s-> System.out.println("numer siedzenia: " + s));
//    }
//
//
//    private static int printNumberOfChair2(FootballClub footballClub){
//        final int[] wynik = new int[1];
//        Optional.ofNullable(footballClub)
//                .map(FootballClub::getStadion)
//                .map(Stadion::getChair)
//           //     .map(Chair::getNumber)
//           //     .ifPresent(s -> wynik[0] = s);
//                return wynik[0];
//    }
//
//}
