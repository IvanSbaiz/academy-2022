package it.euris.solid.ocp.sample2.bad;

public class Warrior extends Character {

    public Warrior() {
        this.characterType = CharacterType.Warrior;
    }

    public void attack(){
        System.out.println("Il guerriero attacca con la spada");
    }

}
