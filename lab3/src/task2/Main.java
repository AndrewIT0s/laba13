package task2;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Red",  5);
        Rectangle rectangle = new Rectangle("Blue",5);
        Triangle triangle = new Triangle("Green", 15);
        circle.print();
        rectangle.print();
        triangle.print();

    }
}
