package it.euris.patterns.structural.composite;

public class Main {

    public static void main(String[] args) {
        Shape s1 = new Triangle();
        Shape s2 = new Circle();

        Drawing d = new Drawing();
        d.add(s1);
        d.add(s2);

        d.draw("red");
        d.draw("blue");
    }


}
