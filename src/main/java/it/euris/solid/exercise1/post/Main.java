package it.euris.solid.exercise1.post;

public class Main {

    public static void main(String[] args) {
        Macchina macchina1 = new Macchina();
        Moto moto1 = new Moto();
        Bici bici1 = new Bici();

        macchina1.guida();
        moto1.rifornimento(10);
        moto1.guida();
        bici1.guida();

    }
}
