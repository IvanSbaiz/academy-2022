package it.euris.patterns.behavioral.observer.sample2;

public class Main {

    public static void main(String[] args) {
        Button button = new Button();
        button.register(new MsgPrinter("ciao"));
        button.register(new MsgPrinter("addio"));
        button.push();
    }

}
