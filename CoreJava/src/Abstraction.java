/**
 * created by Acer on 5/16/23
 **/
public class Abstraction {
    public static void main(String[] args) {
        Shape circle = new Circle(3);
        double circleArea = circle.calculateArea();
        circle.display();
        System.out.println("Circle are is " + circleArea);

        Shape rectangle = new Rectangle(4, 5);
        double recArea = rectangle.calculateArea();
        rectangle.display();
        System.out.println("Rectangle Area is " + recArea);

        Drawable square = new Square();
        square.draw();
    }
}

abstract class Shape{
    public abstract double calculateArea();

    public void display(){
        System.out.println("Displaying Shape");
    }
}

class Circle extends Shape{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private int length;
    private int width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

interface Drawable{
    void draw();
}

class Square implements Drawable{
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}


