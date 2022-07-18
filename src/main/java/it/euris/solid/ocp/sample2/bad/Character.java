package it.euris.solid.ocp.sample2.bad;

import java.util.List;

public abstract class Character {

    protected enum CharacterType {
        Warrior,
        Mage
    }

    protected CharacterType characterType;

    public static void partyAttack(List<Character> characters){
        for (Character character : characters) {
            switch (character.characterType){
                case Warrior:
                    Warrior warriorCharacter = (Warrior) character;
                    warriorCharacter.attack();
                    break;
                case Mage:
                    Mage mageCharacter = (Mage) character;
                    mageCharacter.doMagic();
                    break;
            }
        }
    }


}
