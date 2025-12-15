import java.awt.Color;

public class YellowDecorator extends ColorDecorator {
    public YellowDecorator(ColorComponent color) {
        super(color);
    }

    @Override
    public Color getColor() {
        Color baseColor = super.getColor();
        return new Color(
                255,
                255,
                Math.max(0, baseColor.getBlue() - 100)
        );
    }
}