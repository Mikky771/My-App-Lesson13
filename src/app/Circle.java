package app;

public class Circle implements Shape{
    private double radius;

    // Конструктор
    public Circle(double radius) {
        this.radius = radius;
    }

    // Реалізація методу getArea
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
