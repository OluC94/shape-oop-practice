public abstract class Shape {
    protected String colour;

    public Shape(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return this.colour;
    }

    abstract double area();

    abstract double perimeter();

    abstract String getType();

    public void displayInfo(){
        System.out.println("Type: " + getType());
        System.out.println("Colour: " + getColour());
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
    }
}
