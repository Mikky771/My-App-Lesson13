package app;

public class ShapeUtils {
    // Метод для обчислення сумарної площі всіх фігур у масиві
    public static double getTotalArea(Shape[] shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.getArea();
        }
        return totalArea;
    }

    // Головний метод для демонстрації
    public static void main(String[] args) {
        // Створення масиву фігур
        Shape[] shapes = {
                new Circle(5),
                new Triangle(4, 6),
                new Square(3)
        };

        // Виведення сумарної площі всіх фігур
        double totalArea = getTotalArea(shapes);
        System.out.println("Total Area: " + totalArea);
    }
}
