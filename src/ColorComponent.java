import java.awt.Graphics;

public interface ColorComponent {
    java.awt.Color getColor();
    void draw(Graphics g, int x, int y, int width, int height);
}