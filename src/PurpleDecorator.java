import java.awt.Color;
import java.awt.Graphics;

public class PurpleDecorator extends ColorDecorator {
    public PurpleDecorator(ColorComponent color) {
        super(color);
    }

    @Override
    public void draw(Graphics g, int x, int y, int width, int height) {
        super.draw(g, x, y, width, height);


        g.setColor(new Color(128, 0, 128));
        g.fillRect(x, y, width, height);
    }
}