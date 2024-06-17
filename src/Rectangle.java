public class Rectangle extends Square {
    private final double shortSide;
    public Rectangle(String colour, double length, double shortSide) {
        super(colour, length);
        this.shortSide = shortSide;
    }

    @Override
    double perimeter() {
        return 2 * (this.length + shortSide);
    }

    @Override
    String getType() {
        return "Rectangle";
    }
}
