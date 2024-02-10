package Interface;

interface WaterBottleInterface // It is an outline for a class
    // Interfaces are helpful as it helps you keep track of what you need
    // Disadvantage: The methods declared inside the interface must be implemented by the class
{
    String color = "Blue"; // An interface cannot have a state - ERROR
    void fillUp();
    void pourOut();
}
public class Main implements WaterBottleInterface
    // Everything inside the Interface is (mandatory) be implemented or else it would cause errors
{
    public static void main(String[] args)
    {
        System.out.println(color); // Blue

        Main m = new Main();
        m.fillUp(); // It is filled.
        m.pourOut(); // It is empty.
    }

    @Override
    public void fillUp()
    {
        System.out.println("It is filled.");
    }

    @Override
    public void pourOut()
    {
        System.out.println("It is empty.");
    }

}
