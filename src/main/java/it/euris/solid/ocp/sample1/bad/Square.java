package it.euris.solid.ocp.sample1.bad;

public class Square extends Shape {

    public Square() {
        this.shapeType = ShapeType.Square;
    }

    public void drawSquare(){
        System.out.println("drawSquare");
    }

}
