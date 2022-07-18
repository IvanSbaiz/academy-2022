package it.euris.solid.exercise1.pre;

public class Main {

    public static void main(String[] args) {
        Macchina macchina1 = new Macchina();
        Moto moto1 = new Moto();

        macchina1.guida();
        moto1.rifornimento(10);
        moto1.guida();

    }
}
