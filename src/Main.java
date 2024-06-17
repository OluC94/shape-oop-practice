import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static Circle testCircle = new Circle("red", 22.5d);
    public static Square testSquare = new Square("blue", 3);

    public static ArrayList<Shape> shapes = new ArrayList<>();

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        shapes.add(testCircle);
        shapes.add(testSquare);
        shapes.add(new Circle("green", 5.5));
        shapes.add(new Square("pink", 75));
        shapes.add(new Rectangle("yellow", 50, 65));

        for (Shape s: shapes){
            s.displayInfo();
        }


    }
}

//https://weareacademy.notion.site/Java-Shapes-OOP-Inheritance-practice-5abbf80ff7f845b8b702bb94386ea3d6