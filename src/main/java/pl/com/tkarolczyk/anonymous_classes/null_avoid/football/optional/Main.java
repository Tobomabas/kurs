package pl.com.tkarolczyk.anonymous_classes.null_avoid.football.optional;
import java.util.Optional;
public class Main {
    public static void main(String[] args) {
        FootballClub footballClub = new FootballClub(new Stadion(new Chair(new Number(25))));
        pintNumberofChair(footballClub);
    }
    private static void pintNumberofChair(FootballClub footballClub){
       Optional.ofNullable(footballClub)
                .map(FootballClub::getStadion)
                .flatMap(Stadion::getChair)
                .map(Chair::getNumber)
                .map(Number::getNumber)
                .ifPresent(s -> System.out.println("nr siedzenia to: " +s));
            }
}
