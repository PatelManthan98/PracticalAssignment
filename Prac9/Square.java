package Prac9;
import Prac6.*;
public class Square extends GeometricObject implements Colorable
{
    private double side = 0;

    public Square() {}
    public Square(double side){
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side*side;
    }

    @Override
    public double getPerimeter() {
        return 4*side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
