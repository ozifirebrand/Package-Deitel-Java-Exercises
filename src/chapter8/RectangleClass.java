package chapter8;

public class RectangleClass {
    private double width= 1;
    private double length = 1;
    private double area;
    private double perimeter;
    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void calculateArea(double width, double length){
        area = width * length;
    }
    public double getArea(){
        return area;
    }

    public void calculatePerimeter(double width, double length){
        perimeter = 2 *(width +length);
    }

    public double getPerimeterValue(){
        return perimeter;
    }
}
