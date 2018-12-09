package pl.com.tkarolczyk.stream.team;

import java.math.BigDecimal;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        Player first = new Player("miszcz", 25, BigDecimal.valueOf(10_000));
        Player second = new Player("suaby", 22, BigDecimal.valueOf(120_000));
        Player third = new Player("dobry", 44, BigDecimal.valueOf(10_00));
        Player fourth = new Player("lepszy", 34, BigDecimal.valueOf(110_000));
        Player fiveth = new Player("gruby", 26, BigDecimal.valueOf(20_000));
        Player sisxth = new Player("chudy", 48, BigDecimal.valueOf(250_000));

        Coach coach = new Coach("Jan", "Kowalski", BigDecimal.valueOf(26_5858));
        Coach coach2 = new Coach("Michał", "Nowak", BigDecimal.valueOf(556_5858));


        Team one = new Team(coach);
        one.setPlayers(Arrays.asList(first, second));
        Team two = new Team(coach2);
        two.setPlayers(Arrays.asList(third, fourth, fiveth, sisxth));




        League league = new League("NHL");

        league.setTeamList(Arrays.asList(one, two));




    }





}
