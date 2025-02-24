package Methods;

public class AreaCalculator
{
    public static double area(double radius) {
        return Math.PI * radius * radius;
    }
    public static int area(int length, int width) {
        return length * width;
    }
    public static void main(String[] args) {
        System.out.println("Circle Area: " + area(5.0));
        System.out.println("Rectangle Area: " + area(4, 6));
    }
}
