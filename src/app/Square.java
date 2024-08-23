package app;

public class Square implements Shape {
    private double side;

    // Конструктор
    public Square(double side) {
        this.side = side;
    }

    // Реалізація методу getArea
    @Override
    public double getArea() {
        return side * side;
    }
}
