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
        ColorComponent purple = new PurpleDecorator(new RedColor());

        ColorComponent[] colors = {red, orange, yellow, green, cyan, blue, purple};

        for (int i = 0; i < colors.length; i++) {
            Color awtColor = colors[i].getColor();

            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(awtColor);
            g2d.setStroke(new BasicStroke(50));

            int arcRadius = radius + (colors.length - 1 - i) * 50;
            g2d.drawArc(centerX - arcRadius, centerY - arcRadius,
                    arcRadius * 2, arcRadius * 2, 0, 180);
        }
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(800, 400);
    }
}