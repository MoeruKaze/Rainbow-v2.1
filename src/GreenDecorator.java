import java.awt.Color;

public class GreenDecorator extends ColorDecorator {
    public GreenDecorator(ColorComponent color) {
        super(color);
    }

    @Override
    public Color getColor() {
        Color baseColor = super.getColor();
        return new Color(
                Math.max(0, baseColor.getRed() - 100),
                255,
                Math.max(0, baseColor.getBlue() - 100)
        );
    }
}