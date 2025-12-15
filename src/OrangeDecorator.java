import java.awt.Color;

public class OrangeDecorator extends ColorDecorator {
    public OrangeDecorator(ColorComponent color) {
        super(color);
    }

    @Override
    public Color getColor() {
        Color baseColor = super.getColor();
        return new Color(
                Math.min(255, baseColor.getRed() + 50),
                Math.max(100, baseColor.getGreen() - 30),
                baseColor.getBlue()
        );
    }
}