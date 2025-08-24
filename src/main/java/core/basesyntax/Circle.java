package core.basesyntax;

public class Circle extends Figure implements Draw {
    private final double radius;

    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea()
                + ", radius: " + radius
                + ", color: " + getColor());
    }
}
