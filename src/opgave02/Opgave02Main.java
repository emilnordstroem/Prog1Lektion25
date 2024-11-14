package opgave02;

import opgave02.models.Team;
import opgave02.storage.ChampionsLeagueStorage;

public class Opgave02Main {
    public static void main(String[] args) {
        ChampionsLeagueStorage storage = new ChampionsLeagueStorage();
        Team[] groupA = storage.getGroupA();
        Team[] groupB = storage.getGroupB();
    }
}
