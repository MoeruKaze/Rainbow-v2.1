import java.awt.Color;

public class PurpleDecorator extends ColorDecorator {
    public PurpleDecorator(ColorComponent color) {
        super(color);
    }

    @Override
    public Color getColor() {
        Color baseColor = super.getColor();
        return new Color(
                Math.min(140, baseColor.getRed() + 50),
                Math.max(0, baseColor.getGreen() - 150),
                Math.min(255, baseColor.getBlue() + 100)
        );
    }
}