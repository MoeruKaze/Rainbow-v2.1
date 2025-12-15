import java.awt.Color;

public class CyanDecorator extends ColorDecorator {
    public CyanDecorator(ColorComponent color) {
        super(color);
    }

    @Override
    public Color getColor() {
        Color baseColor = super.getColor();
        return new Color(
                Math.max(0, baseColor.getRed() - 100),
                255,
                255
        );
    }
}