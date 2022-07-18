package it.euris.solid.ocp.sample1.good;

public interface Shape {

    void draw();

    static void drawAll(Shape[] shapes){
        for (Shape shape: shapes) {
            shape.draw();
        }
    }

}
