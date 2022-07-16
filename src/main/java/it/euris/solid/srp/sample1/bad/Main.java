package it.euris.solid.srp.sample1.bad;

public class Main {

    public static void main(String[] args) {
        ITextManipulator tm = new TextManipulator("My String");
        tm.appendText(" ciao");
        tm.findWordAndReplace("ciao", "addio");
        tm.printText();
    }

}
