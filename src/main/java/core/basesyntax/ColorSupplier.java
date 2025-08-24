package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random random = new Random();

    public Color getRandomColor() {
        Color[] colors = Color.values(); // отримуємо всі значення enum
        int index = random.nextInt(colors.length); // випадковий індекс
        return colors[index];
    }
}