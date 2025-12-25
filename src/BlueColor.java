import java.awt.Color;
import java.awt.Graphics;

public class BlueColor implements ColorComponent {
    @Override
    public void draw(Graphics g, int x, int y, int width, int height) {
        g.setColor(Color.BLUE);
        g.fillRect(x, y, width, height);
    }
}