package dev.lpa;

import java.util.ArrayList;
import java.util.List;

public class SportsTeam {
    private String teamName;
    private List<Player> teamMembers = new ArrayList<>();
    private int totlaWins = 0;
    private int totlaLosses = 0;
    private int totlaTies = 0;

    public SportsTeam(String teamName) {
        this.teamName = teamName;
    }

    public void addTeamMember(Player player) {
        if (!teamMembers.contains(player)) {
            teamMembers.add(player);
        }
    }

    public void listTeamMembers() {
        System.out.println(teamName + " Roster:");
        System.out.println(teamMembers);
    }

    public int ranking() {
        return (totlaLosses * 2) + totlaTies + 1;
    }

    public String setScore(int ourScore, int theirScore) {
        String message = "lost to";
        if (ourScore > theirScore) {
            totlaWins++;
            message = "Beat";
        } else if (ourScore == theirScore) {
            totlaTies++;
            message = "tied";
        }
        else{
            totlaLosses++;
        }
        return message;
    }

    @Override
    public String toString() {
        return  teamName + "(Ranked " + ranking() + ")";
    }
}
