package shape;

public abstract class Shape {
    private int  x;
    private int  y;
    public Shape(){}
    public Shape(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }


    public abstract double getArea();
    public abstract double getCircumference();



}
