public abstract class ColorDecorator implements ColorComponent {
    protected ColorComponent decoratedColor;

    public ColorDecorator(ColorComponent color) {
        this.decoratedColor = color;
    }

    @Override
    public java.awt.Color getColor() {
        return decoratedColor.getColor();
    }
}