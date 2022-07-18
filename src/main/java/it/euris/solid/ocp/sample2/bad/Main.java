package it.euris.solid.ocp.sample2.bad;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Character> characters = new ArrayList<>();
        characters.add(new Warrior());
        characters.add(new Mage());
        Character.partyAttack(characters);
    }

}
