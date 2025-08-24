import core.basesyntax.ColorSupplier;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(2);
        switch (figureType) {
            case 0:
                double radius = 1 + random.nextInt(10); // радіус від 1 до 10
                return new Circle(color, radius);
            case 1:
                double width = 1 + random.nextInt(10);
                double height = 1 + random.nextInt(10);
                return new Rectangle(color, width, height);
            default:
                throw new IllegalStateException("Unexpected value: " + figureType);
        }
    }
}
