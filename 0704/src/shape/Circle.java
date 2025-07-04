package shape;

public class Circle extends Shape{
    private double radius;
public Circle(){}
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}
