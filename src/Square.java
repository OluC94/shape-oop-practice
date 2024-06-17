public class Square extends Shape {
    final double length;

    public Square(String colour, double length) {
        super(colour);
        this.length = length;
    }

    @Override
    double area() {
        return length * length;
    }

    @Override
    double perimeter() {
        return length * 4;
    }

    @Override
    String getType() {
        return "Square";
    }
}
