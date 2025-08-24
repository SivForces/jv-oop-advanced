package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements Draw {
    double upperBase;
    double lowerBase;
    double height;

    public IsoscelesTrapezoid(String color, double upperBase, double lowerBase, double height) {
        super(color);
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((upperBase + lowerBase) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea()
                + ", upperBase: " + upperBase + ", lowerBase: " + lowerBase + ", height: " + height
                + ", color: " + getColor());
    }
}

