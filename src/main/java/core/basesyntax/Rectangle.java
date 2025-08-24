package core.basesyntax;

public class Rectangle extends Figure implements Draw{
    double width;
    double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }
    @Override
    double getArea() {
        return width * height;
    }
    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea()
                + ", width: " + width + ", height: "  + height
                + ", color: " + getColor());
    }


}
