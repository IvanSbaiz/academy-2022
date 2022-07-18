package it.euris.solid.ocp.sample2.bad;

public class Mage extends Character {

    public Mage() {
        this.characterType = CharacterType.Mage;
    }

    public void doMagic(){
        System.out.println("Il mago lancia un incantesimo");
    }

}
