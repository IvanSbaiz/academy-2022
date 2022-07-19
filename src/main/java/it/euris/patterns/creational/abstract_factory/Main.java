package it.euris.patterns.creational.abstract_factory;

public class Main {

    public static void main(String[] args) {
        UIFactory factory = new UIFactoryMac();
        factory.buildButton().show();
        factory.buildSlider().show();
        factory.buildWindow().show();
    }

}
