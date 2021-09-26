package chapter8;

public class RectangleMain {
    public static void main(String[] args) {
        RectangleClass rectangle = new RectangleClass();
        rectangle.calculateArea(4,6);
        System.out.println(rectangle.getAreaValue());
        rectangle.calculatePerimeter(4,6);
        System.out.println(rectangle.getPerimeterValue());
    }
}
