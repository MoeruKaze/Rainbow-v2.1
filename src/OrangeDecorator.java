import java.awt.Color;
import java.awt.Graphics;

public class OrangeDecorator extends ColorDecorator {
    public OrangeDecorator(ColorComponent color) {
        super(color);
    }

    @Override
    public void draw(Graphics g, int x, int y, int width, int height) {
        super.draw(g, x, y, width, height);
        g.setColor(Color.ORANGE);
        g.fillArc(x, y, width, height, 0, 180);
    }
}