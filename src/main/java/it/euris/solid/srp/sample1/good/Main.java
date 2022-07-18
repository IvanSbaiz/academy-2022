package it.euris.solid.srp.sample1.good;

public class Main {

    public static void main(String[] args) {
        ITextManipulator tm = new TextManipulator("My String");
        tm.appendText(" ciao");
        tm.findWordAndReplace("ciao", "addio");

        ITextPrinter tp = new TextPrinter(tm);
        tp.printText();
        tp.printOutEachWordOfText();
    }

}
