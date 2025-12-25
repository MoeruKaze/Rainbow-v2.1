import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class RainbowDisplay extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        setBackground(Color.WHITE);
        int width = getWidth();
        int height = getHeight();
        int centerX = width / 2;
        int centerY = height + 100;
        int radius = 150;

        ColorComponent red = new RedColor();
        ColorComponent orange = new OrangeDecorator(new RedColor());
        ColorComponent yellow = new YellowDecorator(new OrangeDecorator(new RedColor()));
        ColorComponent green = new GreenDecorator(new YellowDecorator(new OrangeDecorator(new RedColor())));
        ColorComponent blue = new BlueColor();
        ColorComponent cyan = new CyanDecorator(new BlueColor());
        ColorComponent purple = new PurpleDecorator(new BlueColor());

        ColorComponent[] colors = {red, orange, yellow, green, cyan, blue, purple};

        for (int i = 0; i < colors.length; i++) {
            int arcRadius = radius + (colors.length - 1 - i) * 50;

            int arcX = centerX - arcRadius;
            int arcY = centerY - arcRadius;
            int arcWidth = arcRadius * 2;
            int arcHeight = arcRadius * 2;

            colors[i].draw(g, arcX, arcY, arcWidth, arcHeight);
        }
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(800, 400);
    }
}