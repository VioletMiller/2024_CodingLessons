package main.java.hello;

public class Circle extends Shape {
    private static final double PI = 3.14;
    private double              radius;

    public Circle() {
        radius = 1;
    }

    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    @Override
    public double getArea() {
        double circleArea;
        circleArea = PI * radius * radius;
        return (circleArea);
    }

    public double getRadius() {
        return (radius);
    }

}


