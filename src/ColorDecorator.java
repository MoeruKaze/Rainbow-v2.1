import java.awt.Graphics;

public abstract class ColorDecorator implements ColorComponent {
    protected ColorComponent decoratedColor;

    public ColorDecorator(ColorComponent color) {
        this.decoratedColor = color;
    }

    @Override
    public void draw(Graphics g, int x, int y, int width, int height) {
        decoratedColor.draw(g, x, y, width, height);
    }
}