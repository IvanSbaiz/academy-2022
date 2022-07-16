package it.euris.solid.ocp.sample1.bad;

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[]{ new Circle(), new Square()};
        Shape.drawAll(shapes);
    }

}
