package it.euris.solid.ocp.sample2.good;

import java.util.List;

public class PartyService {

    public void partyTurn(List<Character> characters){
        for (Character character : characters) {
            character.actionTurn();
        }
    }

}
