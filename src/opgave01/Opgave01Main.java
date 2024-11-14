package opgave01;

import opgave01.models.Character;
import opgave01.storage.HogwartsStorage;

import java.util.ArrayList;

public class Opgave01Main {
    public static void main(String[] args) {
        HogwartsStorage storage = new HogwartsStorage();
        ArrayList<Character> gryffindors = storage.getHouseGryffindor();
        ArrayList<Character> slytherins = storage.getHouseSlytherin();
     }

}
