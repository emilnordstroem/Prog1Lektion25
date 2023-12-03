package Opgave02;

import Opgave02.Models.Team;
import Opgave02.Storage.ChampionsLeagueStorage;

public class Opgave02Main {
    public static void main(String[] args) {
        ChampionsLeagueStorage storage = new ChampionsLeagueStorage();
        Team[] groupA = storage.getGroupA();
        Team[] groupB = storage.getGroupB();
    }
}
