package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(5); //
        String color = colorSupplier.getRandomColor();

        return switch (figureType) {
            case 0 -> new Circle(color, 1 + random.nextInt(10));
            case 1 -> new Rectangle(color, 1 + random.nextInt(10), 1 + random.nextInt(10));
            case 2 -> new Square(color, 1 + random.nextInt(10));
            case 3 -> new RightTriangle(color, 1 + random.nextInt(10), 1 + random.nextInt(10));
            case 4 -> new IsoscelesTrapezoid(color, 1 + random.nextInt(10),
                    1 + random.nextInt(10), 1 + random.nextInt(10));
            default -> throw new IllegalStateException("Unexpected value: " + figureType);
        };
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE", 10);
    }
}
