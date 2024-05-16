package dev.lpa;

interface Player {
}

record BaseballPlayer(String name, String position) implements Player {
}

record FootballPlayer(String name, String position) implements Player {
}

public class Main {
    public static void main(String[] args) {
        Baseballteam phillies1 = new Baseballteam("Philadelphia Phillie's");
        Baseballteam astros1 = new Baseballteam("Houston Astros");
        scoreResult(phillies1, 3, astros1, 5);

        SportsTeam phillies2 = new SportsTeam("Philadelphia Phillie's");
        SportsTeam astros2 = new SportsTeam("Houston Astros");
        scoreResult(phillies2, 3, astros2, 5);

        Team<BaseballPlayer> phillies = new Team<>("Philadelphia Phillie's");
        Team<BaseballPlayer> astros = new Team<>("Houston Astros");
        scoreResult(phillies, 3, astros, 5);


        var harper = new BaseballPlayer("B Harper", "Right Fielder");
        var marsh = new BaseballPlayer("B Marsh", "Right Fielder");
        var guthrie = new BaseballPlayer("D Guthrie", "center Fielder");

        phillies.addTeamMember(harper);
        phillies.addTeamMember(marsh);
        phillies.addTeamMember(guthrie);
        phillies.listTeamMembers();

        SportsTeam afc1 = new SportsTeam("Adelaide Crows");
        Team<FootballPlayer> afc = new Team<>("Adelaide Crows");

        var tex = new FootballPlayer("Tex Walker", "Centre half forward");
        afc.addTeamMember(tex);
        var rory = new FootballPlayer("Rory Laird", "Midfield");
        afc.addTeamMember(rory);
        afc.addTeamMember(tex);

        afc.listTeamMembers();

//        Team<String> adelaide = new Team<>("Adelaide Strom");
//        adelaide.addTeamMember("N Robert");
//        adelaide.listTeamMembers();
//
//        var canberra = new Team<String>("Canberra Heat");
//        canberra.addTeamMember("B Black");
//        canberra.listTeamMembers();
//        scoreResult(adelaide, 1, canberra, 2 );
//
//        Team<Integer> melbourneVB = new Team<>("Melbourne Vipers");
//        melbourneVB.addTeamMember(1);
//        melbourneVB.listTeamMembers();


    }

    public static void scoreResult(Baseballteam team1, int t1_score, Baseballteam team2, int t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }

    public static void scoreResult(SportsTeam team1, int t1_score, SportsTeam team2, int t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }

    public static void scoreResult(Team team1, int t1_score, Team team2, int t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }
}
