package OOP;

public class Pen {
    //Attributes of the OOP.Pen
    String type = "gel";
    String color = "blue";
    int point = 10;

    //Methods/How to use the pen?
    static boolean clicked = false;

    public static void click() {
        clicked = true;
    }

    public static void unClick() {
        clicked = false;
    }
}
