import java.awt.Color;
import java.awt.Graphics;

public class RedColor implements ColorComponent {
    @Override
    public Color getColor() {
        return Color.RED;
    }

    @Override
    public void draw(Graphics g, int x, int y, int width, int height) {
        g.setColor(Color.RED);
        g.fillRect(x, y, width, height);
    }
}