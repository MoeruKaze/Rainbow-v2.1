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
        ColorComponent orange = new OrangeDecorator(red);
        ColorComponent yellow = new YellowDecorator(orange);
        ColorComponent green = new GreenDecorator(yellow);
        ColorComponent blue = new BlueColor();
        ColorComponent cyan = new CyanDecorator(blue);
        ColorComponent purple = new PurpleDecorator(blue);

        ColorComponent[] colors = {red, orange, yellow, green, cyan, blue, purple};

        for (int i = 0; i < colors.length; i++) {
            BufferedImage temp = new BufferedImage(1, 1, BufferedImage.TYPE_INT_RGB);
            Graphics2D tempG = temp.createGraphics();
            colors[i].draw(tempG, 0, 0, 1, 1);
            Color awtColor = tempG.getColor();
            tempG.dispose();

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