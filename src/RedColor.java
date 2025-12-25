import java.awt.Color;
import java.awt.Graphics;

public class RedColor implements ColorComponent {
    @Override
    public void draw(Graphics g, int x, int y, int width, int height) {
        g.setColor(Color.RED);
        g.fillArc(x, y, width, height, 0, 180);
    }
}