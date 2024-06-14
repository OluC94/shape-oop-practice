public class Circle extends Shape {
    private final double radius;

    public Circle(String colour, double radius){
        super(colour);
        this.radius = radius;

    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    double perimeter() {
        return Math.PI * (radius * 2);
    }

    @Override
    String getType() {
        return "Circle";
    }
}
