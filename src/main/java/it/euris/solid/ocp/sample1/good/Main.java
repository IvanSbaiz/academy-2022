package it.euris.solid.ocp.sample1.good;

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[]{ new Circle(), new Square(), new Triangle()};
        Shape.drawAll(shapes);
    }

}
