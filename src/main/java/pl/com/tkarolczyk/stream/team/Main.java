package pl.com.tkarolczyk.stream.team;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {
        Player first = new Player("miszcz", 95, BigDecimal.valueOf(10_000));
        Player second = new Player("suaby", 22, BigDecimal.valueOf(120_000));
        Player third = new Player("dobry", 44, BigDecimal.valueOf(10_00));
        Player fourth = new Player("lepszy", 34, BigDecimal.valueOf(110_000));
        Player fiveth = new Player("gruby", 26, BigDecimal.valueOf(20_000));
        Player sisxth = new Player("chudy", 48, BigDecimal.valueOf(250_000));
        Coach coach = new Coach("Jan", "Kowalski", BigDecimal.valueOf(26_5858));
        Coach coach2 = new Coach("Michał", "Nowak", BigDecimal.valueOf(556_5858));


        Coach coach3 = new Coach("Wojtek", "Malinowski", BigDecimal.valueOf(5166_5858));
        Coach coach4 = new Coach("Stefan", "karolczyk", BigDecimal.valueOf(556_582_258));
        Coach coach5 = new Coach("Edward", "Burzczymucha", BigDecimal.valueOf(556_585_118));


        List<Coach> coaches = new ArrayList();
        coaches.add(coach3);
        coaches.add(coach4);
        coaches.add(coach5);


        Team one = new Team(coach);
        one.setPlayers(Arrays.asList(first, second));
        Team two = new Team(coach2);
        two.setPlayers(Arrays.asList(third, fourth, fiveth, sisxth));
        League league = new League("NHL");
        league.setTeamList(Arrays.asList(one, two));
        System.out.println(getAllLeaguePlayers(league));
        System.out.println(getAllLeaguePlayers2(league,player -> player.getSkill() > 90));
        System.out.println(getAllLeaguePlayers2(league,player -> player.getIncome().longValue() > BigDecimal.valueOf(120_000).longValue()));
        System.out.println(getAllLeaguePlayers2(league,player -> player.getNick().startsWith("M")));
    }
    private static List<Player> getAllplayersOldWay(League league) {
        List<Player> resut = new ArrayList<>();
        for (Team e : league.getTeamList()) {
            resut.addAll(e.getPlayers());
        }
        return resut;
    }
    private static List<Player> getAllLeaguePlayers(League league) {
        return league.getTeamList().stream()
                .map(team -> team.getPlayers())
                .flatMap(players -> players.stream())
                .collect(Collectors.toList());
    }
    private static List<Player> getAllLeaguePlayers2(League league, Predicate<Player>playerPredicate) {
        return league.getTeamList().stream()
                .map(team -> team.getPlayers())
                .flatMap(players -> players.stream())
                .filter(playerPredicate)
                .collect(Collectors.toList());
    }
    private static Optional<Coach> giveMeListOFTrainers (List<Coach> coaches){
           return coaches.stream()
                    .filter(coach -> coach.getName().length() == 4)
                    .findFirst();
    }
}
