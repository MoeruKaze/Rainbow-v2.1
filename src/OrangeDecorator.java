import java.awt.Color;
import java.awt.Graphics;

public class OrangeDecorator extends ColorDecorator {
    public OrangeDecorator(ColorComponent color) {
        super(color);
    }

    @Override
    public void draw(Graphics g, int x, int y, int width, int height) {
        g.setColor(new Color(255, 165, 0));
        g.fillRect(x, y, width, height);
    }
}