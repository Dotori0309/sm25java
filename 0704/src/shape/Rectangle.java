package shape;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(){
        super();
    }


    public Rectangle(int x, int y, int width, int height){
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getCircumference() {
        return (width + height) * 2;
    }







}
