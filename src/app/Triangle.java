package app;

public class Triangle implements Shape {
    private double base;
    private double height;

    // Конструктор
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Реалізація методу getArea
    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}