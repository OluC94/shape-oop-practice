//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static Circle testCircle = new Circle("red", 22.5d);
    public static Square testSquare = new Square("blue", 3);

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        testCircle.displayInfo();
        testSquare.displayInfo();


    }
}

//https://weareacademy.notion.site/Java-Shapes-OOP-Inheritance-practice-5abbf80ff7f845b8b702bb94386ea3d6