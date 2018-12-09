package pl.com.tkarolczyk.anonymous_classes.null_avoid.football.optional;

public class FootballClub {

    private Stadion stadion;

    public FootballClub(Stadion stadion) {
        this.stadion = validate(stadion);
    }

    public Stadion getStadion() {
        return stadion;
    }

    public void setStadion(Stadion stadion) {
        this.stadion = validate(stadion);
    }

    @Override
    public String toString() {
        return "FootballClub{" +
                "stadion=" + stadion +
                '}';
    }

     private Stadion validate (Stadion stadion){

        if (null == stadion){
            throw new IllegalArgumentException("Stadion Cannot be NULL!!");
        }
       return stadion;
    }
}
