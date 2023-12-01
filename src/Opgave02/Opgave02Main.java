package Opgave02;

import Opgave02.Storage.ChampionsLeagueStorage;

public class Opgave02Main {
    public static void main(String[] args) {
        String[] numbersAsString = {"one", "two", "three"};
        String input = "onetwo";
        for (String number : numbersAsString) {
            System.out.println("Index of " + number + " is " + input.indexOf(number));
        }
    }
}
