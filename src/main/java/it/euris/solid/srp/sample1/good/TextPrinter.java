package it.euris.solid.srp.sample1.good;

import java.util.Arrays;

public class TextPrinter implements ITextPrinter {

    private final ITextManipulator textManipulator;

    public TextPrinter(ITextManipulator textManipulator) {
        this.textManipulator = textManipulator;
    }

    @Override
    public void printText() {
        System.out.println(textManipulator.getText());
    }

    @Override
    public void printOutEachWordOfText() {
        System.out.println(Arrays.toString(textManipulator.getText().split(" ")));
    }

}
