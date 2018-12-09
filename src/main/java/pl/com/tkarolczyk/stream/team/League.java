package pl.com.tkarolczyk.stream.team;

import java.util.ArrayList;
import java.util.List;

public class League {

    private String LeagueName;
    private List<Team> teamList = new ArrayList<>();


    public League(String leagueName) {
        LeagueName = leagueName;
    }

    public String getLeagueName() {
        return LeagueName;
    }

    public void setLeagueName(String leagueName) {
        LeagueName = leagueName;
    }

    public List<Team> getTeamList() {
        return teamList;
    }

    public void setTeamList(List<Team> teamList) {
        this.teamList = teamList;
    }


    @Override
    public String toString() {
        return "League{" +
                "LeagueName='" + LeagueName + '\'' +
                ", teamList=" + teamList +
                '}';
    }

    public void registerTEam (Team team){
        teamList.add(team);
    }

}
