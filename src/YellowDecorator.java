import java.awt.Color;
import java.awt.Graphics;

public class YellowDecorator extends ColorDecorator {
    public YellowDecorator(ColorComponent color) {
        super(color);
    }

    @Override
    public void draw(Graphics g, int x, int y, int width, int height) {
        super.draw(g, x, y, width, height);

        g.setColor(Color.YELLOW);
        g.fillRect(x, y, width, height);
    }
}