package it.euris.solid.ocp.sample2.good;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        PartyService partyService = new PartyService();
        List<Character> characters = new ArrayList<>();

        characters.add(new Warrior());
        characters.add(new Mage());


        partyService.partyTurn(characters);
        characters.add(new Cleric());
        partyService.partyTurn(characters);
    }

}
