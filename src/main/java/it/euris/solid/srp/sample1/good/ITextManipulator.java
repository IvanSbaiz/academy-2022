package it.euris.solid.srp.sample1.good;

public interface ITextManipulator {
    String getText();
    void appendText(String newText);
    String findWordAndReplace(String word, String replWord);
}
