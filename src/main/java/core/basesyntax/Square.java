package core.basesyntax;

public class Square extends Figure {
    private final double side;

    Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea()
                + ", side: " + side
                + ", color: " + getColor());
    }
}

