package Opgave01;

import Opgave01.Models.Character;
import Opgave01.Storage.HogwartsStorage;

import java.util.ArrayList;

public class Opgave01Main {
    public static void main(String[] args) {
        HogwartsStorage storage = new HogwartsStorage();
        ArrayList<Character> gryffindors = storage.getHouseGryffindor();
        ArrayList<Character> slytherins = storage.getHouseSlytherin();
     }

}
