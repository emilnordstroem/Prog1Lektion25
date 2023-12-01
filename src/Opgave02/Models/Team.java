package Opgave02.Models;

public class Team {
    private String name;
    private int points;
    private int goalsFor;
    private int goalsAgainst;

    public Team(String name, int points, int goalsFor, int goalsAgainst) {
        this.name = name;
        this.points = points;
        this.goalsFor = goalsFor;
        this.goalsAgainst = goalsAgainst;
    }
}
